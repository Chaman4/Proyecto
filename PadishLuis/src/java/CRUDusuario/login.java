package CRUDusuario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String correo,contra;
            int id=0;

            correo = request.getParameter("correo");
            contra = request.getParameter("contrasena");

            id=BD.consultas.login(correo, contra);

            if (id==0) {
                response.sendRedirect("index.html");
            }else{
                HttpSession ses = request.getSession(true);
                ses.setAttribute("id", id);
                String hh="Select usuario.Username,fecharegistro,anuncios.descripcion,titulo,tipoarticulo.nombre,disponibilidad.descripcion,metodosenvio.metodo"
                        + " from anuncios inner join usuario on anuncios.idusuario=usuario.idusuario"
                        + " inner join tipoarticulo on anuncios.idtipo=tipoarticulo.idtipoarticulo"
                        + " inner join disponibilidad on anuncios.iddisponibilidad=disponibilidad.iddisponibilidad"
                        + " inner join metodosenvio on anuncios.idmetodoenvio=metodosenvio.idmetodosenvio"
                        + " where anuncios.idusuario != "+id+"   order by fecharegistro desc,titulo";
                Cookie qwer  = new Cookie("con",hh);
        
                response.addCookie(qwer);
                
                response.sendRedirect("sesioniniciada.jsp");
                
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
