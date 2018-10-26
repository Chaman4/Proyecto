/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDusuario;

import BD.conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luigi
 */
public class registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            /*
            0.- municipio
            1.- Nombre      2.- Contraseña
            3.- Correo      4.- CURP
            5.- Foto        6.- Username
            7.- CP          8.- Direccion
            */
            try{
        String datos[] = new String[9];
        
        datos[0]=request.getParameter("municipio");
        datos[1]=request.getParameter("nombre");
        datos[2]=request.getParameter("contrasena");
        datos[3]=request.getParameter("correo");
        datos[4]=request.getParameter("curp");
        //datos[5]=request.getParameter("");
        datos[5]="dd";
        datos[6]=request.getParameter("usuario");
        datos[7]=request.getParameter("cp");
        datos[8]=request.getParameter("direccion");
        
        for (int i = 0; i < 9; i++) {
            System.out.println(datos[i]);
        }
         boolean dd= BD.altas.registro(datos);
        if(dd){
            int id=0;
            id=BD.consultas.login(datos[3], datos[2]);
            HttpSession ses = request.getSession(true);
            ses.setAttribute("id", id);

            response.sendRedirect("sesioniniciada.jsp");
         }
         else{
             response.sendRedirect("Registro.jsp");
         }
            }catch(Exception e){
                System.out.println(e.getMessage());
                response.sendRedirect("Registro.jsp");
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
