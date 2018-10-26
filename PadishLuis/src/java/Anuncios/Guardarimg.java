/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anuncios;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
 * @author Alumno
 */
public class Guardarimg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession(true);
        if(sesion.getAttribute("usuario")!=null){
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
            }
            
            response.sendRedirect("Inicio Sesión.html");
        }else{
            response.sendRedirect("iniciar.jsp");
        }
    }
      

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
