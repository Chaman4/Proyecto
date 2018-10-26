/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anuncios;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luigi
 */
public class Busenvi extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            System.out.println("ssssss");
        int met = Integer.parseInt(request.getParameter("tip"));
        int id = 0;
            System.out.println("ssssss");
        try{
            HttpSession ses = request.getSession();
            id = (Integer)ses.getAttribute("id");
        }catch(Exception e){
            
        }
        System.out.println("ssssss");
        String q = BD.geneq.metoenvio(id, met);
        
        Cookie qwer  = new Cookie("con",q);
        System.out.println("ssssss");
        response.addCookie(qwer);
              
        if (id==0) {
            response.sendRedirect("resultabusq.jsp");
        }
        else{
            response.sendRedirect("sesioniniciada.jsp");
        }
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
