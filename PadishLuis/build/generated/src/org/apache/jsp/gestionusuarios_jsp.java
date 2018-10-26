package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gestionusuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  body{\n");
      out.write("    background: url(imagenes/azul.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    font-family: 'Titillium Web', sans-serif;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  </style>\n");
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
      out.write("          <div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-light w3-card\" style=\"background-color: white; \">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button\" id=\"loginform\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>Mi Perfil</a>\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\n");
      out.write("    \t<div id=\"navthing\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <a href=\"registraranuncio.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-user-times\" aria-hidden=\"true\"></i> Usuarios</a>\n");
      out.write("    <a href=\"registraranuncio.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-cloud-upload\" aria-hidden=\"true\"></i> Anuncios</a>\n");
      out.write("        <a href=\"cerrarsesion\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Cerrar Sesión</a>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium\" onclick=\"w3_open()\">\n");
      out.write("      <i class=\"fa fa-bars\"></i>\n");
      out.write("    </a>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("    <br><br><br><br><br><br>\n");
      out.write("        <div class=\"container\" id=\"con\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <br>\n");
      out.write("            <table class=\"table table-bordered\" id=\"tab\">\n");
      out.write("                <tr id=\"th\">\n");
      out.write("                <h2>QUEJAS</h2>\n");
      out.write("                    <th class=\"text-center\" >Tipo de Problema</th>\n");
      out.write("\n");
      out.write("                    <th class=\"text-center\" >Nombre del afectado</th>\n");
      out.write("                    \n");
      out.write("                    <th class=\"text-center\" >Comentarios</th>\n");
      out.write("\n");
      out.write("                    <th class=\"text-center\" ></th>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <br>\n");
      out.write("                            <td class=\"text-center\">EJEMPLO</td>\n");
      out.write("                            <td class=\"text-center\">EJEMPLO</td>\n");
      out.write("                            <td class=\"text-center\">EJEMPLO</td>\n");
      out.write("                            <td class=\"text-center\">\n");
      out.write("                                 <button class=\"button \"/><span>Resolver</span>  </button>\n");
      out.write("                           \n");
      out.write("                            </td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                      \n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
