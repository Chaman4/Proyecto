/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anuncios;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Luigi
 */
public class registraranuncio extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            System.out.println("dddddd");
            HttpSession sesion = request.getSession();
            System.out.println("dddddd");
            String datos[] = new String[9];
            //idusuario,idtipo,idmetodoenvio,iddisponibilidad,descripcion,foto,fecharegistro,titulo,dimensiones
            Date fecha = new Date();
            System.out.println("dddddd");
            datos[0] = ((Integer)sesion.getAttribute("id")).toString();
            System.out.println("dddddd");
            datos[1] = request.getParameter("tipo");
            datos[2] = request.getParameter("metodo");
            System.out.println("dddddd");
            datos[3] = request.getParameter("des");
            datos[4] = request.getParameter("foto");
            System.out.println("dddddd");
            datos[5] = fecha.getYear()+1900+"-"+fecha.getMonth()+"-"+fecha.getDate();
            datos[6] = request.getParameter("titulo");
            datos[7] = request.getParameter("dim1");
            System.out.println("dddddd");
            datos[8] = request.getParameter("dim2");

            for (int i = 0; i < 9; i++) {
                System.out.println(datos[i]+"      "+request.getParameter("cma"));
            }
            BD.altas.registraranuncio(datos,request.getParameter("cma"));
        
            
            
          /*  
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            String itemName = null;
            String name = null;
            String exte = null;
            if (!isMultipart) {
                System.out.println("No es multipart");
            }else{
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List items = null;
                try{
                    items = upload.parseRequest(request);
                }catch (FileUploadException e) {
                    e.printStackTrace();
                }
                Iterator itr = items.iterator();
                while (itr.hasNext()){
                    FileItem item = (FileItem)itr.next();
                    System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
                    if(item.isFormField()){
                        String nombrecampo=item.getFieldName();
                        String valorcampo=item.getString();
                        if(nombrecampo.equals("palabra"))
                        {
                            itemName=valorcampo;
                        }
                    }else{
                        name = item.getName();
                        exte = name.substring(name.length()-4, name.length());
                        if(exte.equals(".jpg")){
                            try{
                            
                            File savedFile = new File(getServletContext().getRealPath("/")+"Imagenes/"+itemName+".jpg");
                            item.write(savedFile);
                            }catch(Exception e){
                                System.out.println("NO guardó el archivo");
                                e.printStackTrace();
                            }
                        }else{
                            System.out.println("No tiene extension '.jpg'");
                        }
                    } 
                }
            }*/
            
            response.sendRedirect("sesioniniciada.jsp");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
