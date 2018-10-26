package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class sesioniniciada_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

try{
    HttpSession sesion = request.getSession();
    int dsfsdf= (Integer) sesion.getAttribute("id");
    System.out.println(dsfsdf);
}catch(Exception e){
    
        response.sendRedirect("index.html");
}
 
System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        
        Cookie dd[] = request.getCookies();
        String gg="";
        if (dd.length==1) {
                gg = dd[0].getValue();
            }
        else{
            for (int i = 0; i < dd.length; i++) {
                    if (dd[i].getName().equalsIgnoreCase("con")) {
                        gg=dd[i].getValue();
                    }
                }
        }
        System.out.println("*********************************************************");
        System.out.println(gg);
        ArrayList<Anuncios.datosvista> list = BD.consultas.lista(gg);
        //25 anucios
        

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <style>\n");
      out.write("  body,h1,h2,h3,h4,h5,h6 {font-family: \"Raleway\", sans-serif}\n");
      out.write("  body, html {\n");
      out.write("    height: 100%;\n");
      out.write("    line-height: 1.5;\n");
      out.write("  }\n");
      out.write("  .dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Dropdown Content (Hidden by Default) */\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Links inside the dropdown */\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Show the dropdown menu on hover */\n");
      out.write(".dropdown:hover .dropdown-content {display: block;}\n");
      out.write("  .bgimg-1 {\n");
      out.write("    background-position: center;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-image: url(\"DA WAE.jpg\");\n");
      out.write("    min-height: 110%;\n");
      out.write("  }\n");
      out.write("  .w3-bar .w3-button {\n");
      out.write("    padding: 16px;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"imagenes/LOGO.png\">\n");
      out.write("<title>Padish | Donando por un México mejor</title>\n");
      out.write("\n");
      out.write("   <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <form action=\"Busca\" id=\"for\">\n");
      out.write("        <div id=\"sidebar-wrapper\">\n");
      out.write("          <br>\n");
      out.write("            <ul class=\"sidebar-nav\">\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("                <li class=\"sidebar-brand\">\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                      <fieldset id=\"fie\">\n");
      out.write("                        <input id=\"in\" name=\"in\" type=\"search\" placeholder=\"Buscar...\" />\n");
      out.write("                      \n");
      out.write("                      <button id=\"but\" type=\"submit\">\n");
      out.write("                        <i class=\"fa fa-search\"></i>\n");
      out.write("                      </button>\n");
      out.write("                    \n");
      out.write("                      </fieldset>\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("        <a href=\"#\" class=\"dropbtn\">Categorias</a>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"Busca?tip=1\">Sillas de ruedas</a>\n");
      out.write("    <a href=\"Busca?tip=3\">Bastones</a>\n");
      out.write("    <a href=\"Busca?tip=2\">Muletas</a>\n");
      out.write("    <a href=\"Busca?tip=4\">Andaderas</a>\n");
      out.write("  </div>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<li>\n");
      out.write("    <div>\n");
      out.write("    <a href=\"#\"> Disponibilidad</a>\n");
      out.write("    </div>\n");
      out.write("    <font color=\"white\">\n");
      out.write("    <div>\n");
      out.write("            <input type=\"checkbox\" id=\"Disponible\" \n");
      out.write("                   name=\"d\" value=\"Disponible\"/>\n");
      out.write("            <label for=\"Disponible\">Disponible</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <input type=\"checkbox\" id=\"No disponible\" \n");
      out.write("                   name=\"nd\" value=\"No disponible\" />\n");
      out.write("            <label for=\"No disponible\">No disponible</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <input type=\"checkbox\" id=\"En proceso\" \n");
      out.write("                   name=\"ep\" value=\"En proceso\" />\n");
      out.write("            <label for=\"En proceso\">En proceso</label>\n");
      out.write("        </div></font>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("<a href=\"#\" class=\"dropbtn\">Metodos de envio</a>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"Busenvi?tip=1\">Entrega por externo</a>\n");
      out.write("    <a href=\"Busenvi?tip=2\">Entrega por cita</a>\n");
      out.write("  </div>\n");
      out.write("</li>\n");
      out.write("            </ul>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("            <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<br><br><br>\n");
      out.write("          <div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-light w3-card\" style=\"background-color: white; \">\n");
      out.write("    <a href=\"#menu-toggle\" class=\"w3-bar-item w3-button\" id=\"menu-toggle\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i>BUSQUEDA</a>\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\n");
      out.write("    \t<div id=\"navthing\">\n");
      out.write("    <a href=\"Misanuncios.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-folder\" aria-hidden=\"true\"></i>Mis anuncios</a>\n");
      out.write("    <a href=\"modificarperfil.jsp\" class=\"w3-bar-item w3-button\" id=\"loginform\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>Mi Perfil</a>\n");
      out.write("    <a href=\"registraranuncio.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-cloud-upload\" aria-hidden=\"true\"></i> Publicar</a>\n");
      out.write("    <a href=\"Chat.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-comments\" aria-hidden=\"true\"></i> Chat</a>\n");
      out.write("        <a href=\"cerrarsesion\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Cerrar Sesión</a>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium\" onclick=\"w3_open()\">\n");
      out.write("      <i class=\"fa fa-bars\"></i>\n");
      out.write("    </a>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("<!-- Hero Add -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <table style=\"width: 100%;\">\n");
      out.write("\n");
      out.write("    ");

        int repeticiones=0;
        try{
            repeticiones= Integer.parseInt(request.getParameter("pag"));
        }catch(Exception e){
            
        }
        int aescribir = list.size()-(8*(repeticiones));
        int j=0;
        
        if (aescribir < 8) {
                //aescribir = -aescribir;
            }else if(aescribir<=0){
                response.sendRedirect("sesioniniciada.jsp");
            }else{
            aescribir = 8;
        }
        System.out.println(aescribir+"            "+list.size());
        
    for (int i = 8*repeticiones; i < (8*repeticiones+aescribir); i++) {
        if (j==0) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("    ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <td align=\"center\" style=\"padding: 10px;\">\n");
      out.write("                \n");
      out.write("       \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--out.println(\"Titulo: \"+list.get(i).getTitulo());\n");
      out.write("            out.println(\"<br>\");\n");
      out.write("            out.println(\"Anunciante: \"+list.get(i).getUsuario());\n");
      out.write("            out.println(\"<br>\");\n");
      out.write("            out.println(\"Fecha de publicacion: \"+list.get(i).getFecha());\n");
      out.write("            out.println(\"<br>\");\n");
      out.write("            out.println(\"Tipo de articulo: \"+list.get(i).getTipo());\n");
      out.write("            out.println(\"<br>\");\n");
      out.write("            out.println(\"Descripcion: \"+list.get(i).getDescripcion());\n");
      out.write("            out.println(\"<br><br><br>\");-->\n");
      out.write("            <div class=\"card\" style=\"width: 20rem;\" align=\"left\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">");
      out.print(list.get(i).getTitulo());
      out.write("</h5>\n");
      out.write("    <h6 class=\"card-subtitle mb-2 text-muted\">");
      out.print(list.get(i).getTipo());
      out.write("</h6>\n");
      out.write("    <h6 class=\"card-subtitle mb-2 text-muted\">");
      out.print(list.get(i).getDisponible());
      out.write("</h6>\n");
      out.write("    ");

    String desc = list.get(i).getDescripcion();
    if (desc.length() > 50) {
        desc="";
            for (int k = 0; k < 47; k++) {
                    desc += list.get(i).getDescripcion().charAt(k);
                }
            desc += "...";
        }
    
      out.write("\n");
      out.write("    <p class=\"card-text\">");
      out.print(desc);
      out.write("</p>\n");
      out.write("    <p class=\"card-text\">Publicado el dia ");
      out.print(list.get(i).getFecha());
      out.write(" por ");
      out.print(list.get(i).getUsuario());
      out.write("</p>\n");
      out.write("    <p class=\"card-text\">");
      out.print(list.get(i).getMetodoenvio());
      out.write(" </p>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <a class=\"card-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#modal");
      out.print(i);
      out.write("\">Mostar Articulo</a>\n");
      out.write("    \n");
      out.write("    <!-- Button trigger modal \n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\">\n");
      out.write("  Launch demo modal\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"modal");
      out.print(i);
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("          \n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">");
      out.print(list.get(i).getTitulo());
      out.write("</h5>\n");
      out.write("          \n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          \n");
      out.write("        <table style=\"width:100%\">\n");
      out.write("            <td style=\"width:250px; text-align: initial; vertical-align: top;\">\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                ");
      out.print(list.get(i).getDescripcion());
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Proximamente imagen 100% falsa, fake, sin link mega\n");
      out.write("               \n");
      out.write("               \n");
      out.write("            </td>\n");
      out.write("            <td style=\"width:170px\">\n");
      out.write("                <h6 class=\"card-subtitle mb-2 text-muted\">Anunciante:</h6>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-primary\">");
      out.print(list.get(i).getUsuario());
      out.write("</button>\n");
      out.write("                    \n");
      out.write("                <br><br>\n");
      out.write("                <h6 class=\"card-subtitle mb-2 text-muted\">Detalles:</h6>\n");
      out.write("                \n");
      out.write("                ");

                /*
                    <a href="Busca?tip=1">Sillas de ruedas</a>
    <a href="Busca?tip=3">Bastones</a>
    <a href="Busca?tip=2">Muletas</a>
    <a href="Busca?tip=4">Andaderas</a>
                    */
                String tipo="";
                switch (list.get(i).getDisponible().charAt(0)){
                    case 'D':
                        tipo="d";
                    break;
                    case 'N':
                        tipo="nd";
                    break;
                    case 'E':
                        tipo="ep";
                    break;
                }
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <a class=\"btn btn-outline-secondary\" href=\"Busca?");
      out.print(tipo);
      out.write("=true&&in=\" style=\"width: 160px\" align=\"left\">");
      out.print(list.get(i).getDisponible());
      out.write("</a>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                ");

                    
                    String link="";
                    try{
                        
                    switch (list.get(i).getTipo().charAt(0)){
                        case 'S':
                            link="Busca?tip=1";
                            break;
                        case 'B':
                            link="Busca?tip=3";
                            break;
                        case 'M':
                            link="Busca?tip=2";
                            break;
                        case 'A':
                            link="Busca?tip=4";
                            break;
                            
                    }
                    System.out.println("ddddddddddddd"+link);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                   
      out.write("\n");
      out.write("                   <a class=\"btn btn-outline-secondary\" href=\"");
      out.print(link);
      out.write("\" style=\"width: 160px\" align=\"left\">");
      out.print(list.get(i).getTipo());
      out.write("</a>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

                    try{
                if (list.get(i).getMetodoenvio().equalsIgnoreCase("Entrega por cita")) {
                            link="Busenvi?tip=2";
                        }
                    if (list.get(i).getMetodoenvio().equalsIgnoreCase("Entrega por externo")) {
                            link="Busenvi?tip=1";
                        }
                    System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"+link);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                
      out.write("\n");
      out.write("                <a class=\"btn btn-outline-secondary\" href=\"");
      out.print(link);
      out.write("\" style=\"width: 160px\" align=\"left\">");
      out.print(list.get(i).getMetodoenvio());
      out.write("</a>\n");
      out.write("            </td>\n");
      out.write("        </table>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        \n");
      out.write("          \n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Solicitar articulo</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("            ");

                if (j==3) {
            
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                    j=-1;   
                }
                j++;
        }


      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("        ");

    /*
    <div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>

    */
    if (list.isEmpty()) {
            
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("  <h1 class=\"display-4\">Lo sentimos</h1>\n");
      out.write("  <p class=\"lead\">No pudimos hallar ningun articulo con las caracteristicas que solicito</p>\n");
      out.write("  <hr class=\"my-4\">\n");
      out.write("  <p>Busque articulos con otras caracteristicas</p>\n");
      out.write("</div>\n");
      out.write("        ");

        }else{
    
      out.write(" \n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

    if (list.size()>8) {
         
    
      out.write("\n");
      out.write("    <nav aria-label=\"Page navigation example\">\n");
      out.write("  <ul class=\"pagination justify-content-end\">\n");
      out.write("      \n");
      out.write("      ");

      if (repeticiones !=0) {
              
      out.write("\n");
      out.write("      <li class=\"page-item\">\n");
      out.write("      <a class=\"page-link\" href=\"sesioniniciada.jsp?pag=");
      out.print((repeticiones-1));
      out.write("\" tabindex=\"-1\">Anterior</a>\n");
      out.write("    </li>\n");
      out.write("      ");

          }
      
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

        int menus = list.size()/8;
        if (list.size()%8 != 0) {
                menus++;
            }
        
        for (int i = 0; i < menus; i++) {
         
    
      out.write("\n");
      out.write("    <li class=\"page-item\"><a class=\"page-link\" href=\"sesioniniciada.jsp?pag=");
      out.print((i));
      out.write('"');
      out.write('>');
      out.print((i+1));
      out.write("</a></li>\n");
      out.write("    ");
   
        }
if (menus != (repeticiones+1)) {
       
      out.write("\n");
      out.write("    \n");
      out.write("    <li class=\"page-item\">\n");
      out.write("      <a class=\"page-link\" href=\"sesioniniciada.jsp?pag=");
      out.print((repeticiones+1));
      out.write("\">Siguiente</a>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("        ");
 
    }

      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("        ");

   
        }
    }
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Menu Toggle Script -->\n");
      out.write("    <script>\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <script  src=\"js/index.js\"></script>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
