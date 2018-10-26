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
 * @author Alumno
 */
public class Busca extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
         System.out.println("wqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        boolean eww=true;
        //en proceso ep
        boolean aww=true;
        //disponible d
        boolean zww=true;
        int tip=0;
        //no disponible nd
        boolean seas=true;
        String tit="";
        try{
            
            tip = Integer.parseInt(request.getParameter("tip"));
        }catch(Exception e){
            zww= !(request.getParameter("nd") == null);
            aww = !(request.getParameter("d") == null);
            eww= !(request.getParameter("ep") == null);
            tit = request.getParameter("in");
            System.out.println(e.getMessage());
        }
        
        int id=0;
        try{
        HttpSession ses = request.getSession();
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        if (! (ses==null)) {
            id = (Integer) ses.getAttribute("id");
            seas=false;
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        String q = BD.geneq.busqueda(id, aww, zww, eww, tip,tit);
        
        Cookie qwer  = new Cookie("con",q);
        
        response.addCookie(qwer);
              
        if (seas) {
            response.sendRedirect("resultabusq.jsp");
        }
        else{
            response.sendRedirect("sesioniniciada.jsp");
        }
        }catch(Exception dd){
            System.out.println(dd.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
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
