/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luigi
 */
public class descargarPDF extends HttpServlet {
    private static final Font chapterFont = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
    private static final Font paragraphFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    
    
    
    public void createPDF(File pdfNewFile,String doc,String pac[],int idt){
        // Creamos el documento e indicamos el nombre del fichero.
        try {
            Document document = new Document();
            try {

                PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));

            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("No such file was found to generate the PDF "
                        + "(No se encontrÃ³ el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            // We add metadata to PDF
            // AÃ±adimos los metadatos del PDF
            document.addTitle("Expediente");
            document.addSubject("");
            document.addKeywords("Java, PDF, iText");
            document.addAuthor("Dr. momo");
            document.addCreator("CÃ³digo Xules");
            
            // First page
            // Primera pÃ¡gina 
            
            Chunk chunk = new Chunk("                                   Expediente", chapterFont);
            
            //chunk.setBackground(BaseColor.GRAY);
            // Let's create de first Chapter (Creemos el primer capÃ­tulo)
            Chapter chapter = new Chapter(new Paragraph(chunk), 1);
           
            
            chapter.setNumberDepth(0);
            System.out.println(pac[0]+"cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"+doc);
            
             Connection con = BD.conexion.getConnection();
             /*table1
INNER JOIN table2 ON table1.column_name = table2.column_name*/
             
             /*
             Paragraph titpaci = new Paragraph("Datos del paciente", subcategoryFont);
                titpaci.setAlignment(Element.ALIGN_CENTER);
                chapter.add(titpaci);
             */
             Paragraph titpaci = new Paragraph("Datos del paciente", subcategoryFont);
                titpaci.setAlignment(Element.ALIGN_CENTER);
                chapter.add(titpaci);
                document.add(chapter);
                document.close();
                System.out.println("Your PDF file has been generated!(¡Se ha generado tu hoja PDF!");
            
            
            
            
        } catch (DocumentException documentException) {
            System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
        }
}


    
    
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        try { 
            
            
            HttpSession sesion = request.getSession();
            int doc=(Integer)sesion.getAttribute("user");
            int pac=Integer.parseInt(request.getParameter("idpac"));
            
            String docto[] = new String[2];
            String paca[] = new String[2];
            Connection con = BD.conexion.getConnection();
            
            String q="Select nombre,apa,app,idU From usuarios where idU='"+doc+"' OR idU='"+pac+"'";
            
            System.out.println("lllllllllllllllllllllllllllllllllllllllllllllllllllllll1");
            PreparedStatement pre1 = con.prepareStatement(q);
            ResultSet res1= pre1.executeQuery();
            
            int yoj=0;
            while (res1.next()) {                
                
                if (res1.getInt(4) == doc) {
                    docto[0]=res1.getString(1)+" "+res1.getString(2)+" "+res1.getString(3);
                    docto[1]=res1.getString(4);
                }
                else{
                    paca[0]=res1.getString(1)+" "+res1.getString(2)+" "+res1.getString(3);
                    paca[1]=res1.getString(4);
                }
            }
            System.out.println("lllllllllllllllllllllllllllllllllllllllllllllllllllllll1");
            int idt= Integer.parseInt(request.getParameter("idtrat"));
            System.out.println("lllllllllllllllllllllllllllllllllllllllllllllllllllllll1");
            descargarPDF generatePDFFileIText = new descargarPDF();
            
            String url="C:\\Users\\Luigi\\Documents\\pdf\\"+docto[0]+""+pac+".pdf";
            generatePDFFileIText.createPDF(new File(url),docto[0],paca,idt);
            
            
            response.setContentType("application/pdf");
        response.setHeader("Cache-Control", "no-cache"); // HTTP 1.1
        response.setHeader("Cache-Control", "max-age=0");
        response.setHeader("Content-disposition",
                "attachment; filename=Expediente "+paca[0]+".pdf");
        ServletOutputStream stream = response.getOutputStream();
        FileInputStream input = new FileInputStream(url);
        BufferedInputStream buf = new BufferedInputStream(input);
        int readBytes = 0;

        while ((readBytes = buf.read()) != -1) {
            stream.write(readBytes);
        }

        stream.flush();
        stream.close();
            
            con.close();
            response.sendRedirect("verpac.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(descargarPDF.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("verpac.jsp");
        }
        }catch(Exception e){
            System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            System.out.println(e.getMessage());
//            response.sendRedirect("verpac.jsp");
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    class CustomDashedLineSeparator extends DottedLineSeparator {
        protected float dash = 5;
        protected float phase = 2.5f;

        public float getDash() {
            return dash;
        }

        public float getPhase() {
            return phase;
        }

        public void setDash(float dash) {
            this.dash = dash;
        }

        public void setPhase(float phase) {
            this.phase = phase;
        }
        
        public void draw(PdfContentByte canvas, float llx, float lly, float urx, float ury, float y) {
            canvas.saveState();
            canvas.setLineWidth(lineWidth);
            canvas.setLineDash(dash, gap, phase);
            drawLine(canvas, llx, urx, y);
            canvas.restoreState();
        }
    }

    
}
