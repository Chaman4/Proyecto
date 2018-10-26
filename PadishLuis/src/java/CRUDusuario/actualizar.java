package CRUDusuario;

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
public class actualizar extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String datos[][]= new String[7][2];
        datos[0][0]= request.getParameter("municipio"); /*municipio*/
        datos[0][1]= "idMunicipio";
        datos[1][0]=request.getParameter("contrasena"); /*Contraseña*/
        datos[1][1]="Contraseña";
        datos[2][0]=""; /*correo*/
        datos[2][1]="Correo";
        datos[3][0]=""; /*Foto*/
        datos[3][1]="Foto";
        datos[4][0]=request.getParameter("user"); /*User name*/
        datos[4][1]="Username";
        datos[5][0]=request.getParameter("CP"); /*CP*/
        datos[5][1]="CP";
        datos[6][0]=request.getParameter("direccion"); /*Direccion*/
        datos[6][1]="Direccion";
        
        System.out.println("qqqqqqqqqqqqqqqqqqqvvvvvvvvvvvvvvvvv"+datos[3][0]);
        for (int i = 0; i < 7; i++) {
            System.out.println(datos[i][0]+"     gbb     "+datos[5][0]);
        }
        HttpSession ses = request.getSession();
        BD.actualizarBD.actusuario(datos,(Integer)ses.getAttribute("id"));
        
        /*UPDATE table_name SET field1 = new-value1, field2 = new-value2
[WHERE Clause]*/
        response.sendRedirect("sesioniniciada.jsp");
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
