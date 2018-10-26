<%-- 
    Document   : modificar perfil
    Created on : 22/09/2018, 07:11:00 PM
    Author     : Luigi
--%>

<%@page import="BD.consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        HttpSession sesion = request.getSession();
        int dsfsdf= (Integer) sesion.getAttribute("id");
    }catch(Exception e){
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyy");
        response.sendRedirect("index.html");
    }
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="css/style.css">
  <style>
  body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
  body, html {
    height: 100%;
    line-height: 1.5;
  }
  .dropdown {
    position: relative;
    display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f1f1f1;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {display: block;}
  .bgimg-1 {
    background-position: center;
    background-size: cover;
    background-image: url("DA WAE.jpg");
    min-height: 110%;
  }
  .w3-bar .w3-button {
    padding: 16px;
  }
  body{
    background: url(imagenes/azul.jpg);
    background-size: cover;
    font-family: 'Titillium Web', sans-serif;

  }
  </style>
  <link rel="shortcut icon" type="image/png" href="imagenes/LOGO.png">
<title>Padish | Donando por un México mejor</title>
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/simple-sidebar.css" rel="stylesheet">
</head>
<body>
	
    <div id="wrapper">

        <!-- Sidebar -->
        <form action="Busca" id="for">
        <div id="sidebar-wrapper">
          <br>
            <ul class="sidebar-nav">
              <br>
              
                <li class="sidebar-brand">
                  
                    
                      <fieldset id="fie">
                        <input id="in" name="in" type="search" placeholder="Buscar..." />
                      
                      <button id="but" type="submit">
                        <i class="fa fa-search"></i>
                      </button>
                    
                      </fieldset>
                    
                </li>
                
                <li class="dropdown">
        <a href="#" class="dropbtn">Categorias</a>
  <div class="dropdown-content">
    <a href="Busca?tip=1">Sillas de ruedas</a>
    <a href="Busca?tip=3">Bastones</a>
    <a href="Busca?tip=2">Muletas</a>
    <a href="Busca?tip=4">Andaderas</a>
  </div>
</li>




<li>
    <div>
    <a href="#"> Disponibilidad</a>
    </div>
    <font color="white">
    <div>
            <input type="checkbox" id="Disponible" 
                   name="d" value="Disponible"/>
            <label for="Disponible">Disponible</label>
        </div>

        <div>
            <input type="checkbox" id="No disponible" 
                   name="nd" value="No disponible" />
            <label for="No disponible">No disponible</label>
        </div>

        <div>
            <input type="checkbox" id="En proceso" 
                   name="ep" value="En proceso" />
            <label for="En proceso">En proceso</label>
        </div></font>
</li>

<li class="dropdown">
<a href="#" class="dropbtn">Metodos de envio</a>
  <div class="dropdown-content">
    <a href="Busenvi?tip=1">Entrega por externo</a>
    <a href="Busenvi?tip=2">Entrega por cita</a>
  </div>
</li>
            </ul>
          </form>
        </div>
        
           
            <!-- /#sidebar-wrapper -->

        <!-- Page Content -->


<br><br><br>
          <div class="w3-top">
  <div class="w3-bar w3-light w3-card" style="background-color: white; ">
    <a href="#menu-toggle" class="w3-bar-item w3-button" id="menu-toggle"><i class="fa fa-search" aria-hidden="true"></i>BUSQUEDA</a>
    <div class="w3-right w3-hide-small">
    	<div id="navthing">
    <a href="Misanuncios.jsp" class="w3-bar-item w3-button"><i class="fa fa-folder" aria-hidden="true"></i>Mis anuncios</a>
    <a href="modificarperfil.jsp" class="w3-bar-item w3-button" id="loginform"><i class="fa fa-user-circle" aria-hidden="true"></i>Mi Perfil</a>
    <a href="registraranuncio.jsp" class="w3-bar-item w3-button"><i class="fa fa-cloud-upload" aria-hidden="true"></i> Publicar</a>
    <a href="Chat.jsp" class="w3-bar-item w3-button"><i class="fa fa-comments" aria-hidden="true"></i> Chat</a>
        <a href="cerrarsesion" class="w3-bar-item w3-button"><i class="fa fa-sign-out" aria-hidden="true"></i> Cerrar Sesión</a>
    </div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
</div>
  </div>
 </div>
 <br>
       <br>
       <br>

<br>


<div class="col-sm-10">
    
        <div class="card" align="right" >
            <div class="card-body" align="center" >
                <div class="row" align="center">
                    <div class="col-md-12" >
                        <h4>Perfil</h4>
                        <hr>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <form action="actualizar">
                              <div class="form-group row">
                                <label for="usuaro" class="col-4 col-form-label">Nombre de usuario</label> 
                                <div class="col-8">
                                    <input name="user" id="user" placeholder="Nombre de usuario" class="form-control here" type="text">
                                </div>
                              </div>
                             <!--/* <div class="form-group row">
                                <label for="nombre" class="col-4 col-form-label">Nombre</label> 
                                <div class="col-8">
                                  <input id="nombre" name="nombre" placeholder="Nombre" class="form-control here" type="text">
                                </div>
                              </div>*/-->
                              <!--<div class="form-group row">
                                <label for="apellidos" class="col-4 col-form-label">Apellidos</label> 
                                <div class="col-8">
                                  <input id="apellidos" name="apellidos" placeholder="Apellidos" class="form-control here" type="text">
                                </div>
                              </div>-->
                              <div class="form-group row">
                                <label for="municipio" class="col-4 col-form-label">Municipio</label> 
                                <div class="col-8">
                                    <select name="municipio" class="form-control" id="municipio" required="">
                                        <%
                                        String lis[][] = consultas.listmunicipio();
                                        for (int i = 0; i < lis.length; i++) {
                                                out.print("<option value="+lis[i][0]+">"+lis[i][1]+"</option>");
                                            }
                                        %>
                                    </select>
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="direccion" class="col-4 col-form-label">Direccion</label> 
                                <div class="col-8">
                                  <input name="direccion" id="direccion" placeholder="Direccion" class="form-control here" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="postal" class="col-4 col-form-label">Codigo Postal</label> 
                                <div class="col-8">
                                  <input name="CP" id="CP" placeholder="Codigo Postal" class="form-control here" type="number">
                                </div>
                              </div>
                              <!--<div class="form-group row">
                                <label for="email" class="col-4 col-form-label">Email</label> 
                                <div class="col-8">
                                  <input id="email" name="email" placeholder="Email" class="form-control here" required="required" type="text">
                                </div>
                              </div>-->
                              <!--<div class="form-group row">
                                <label for="info" class="col-4 col-form-label">Informacion publica</label> 
                                <div class="col-8">
                                  <textarea id="info" name="info" cols="40" rows="4" class="form-control"></textarea>
                                </div>
                              </div>-->
                              <div class="form-group row">
                                <label for="nueva" class="col-4 col-form-label">Contraseña nueva</label> 
                                <div class="col-8">
                                  <input name="contrasena" id="contrasena" placeholder="Contraseña nueva" class="form-control here" type="text">
                                </div>
                              </div> 
                              <div class="form-group row">
                                <div class="offset-4 col-8">
                                  <button name="submit" type="submit" class="btn btn-primary">Actualizar perfil</button>
                                  <a href="borrarusuario" class="btn btn-danger">Borrar Perfil</a>
                                </div>
                              </div>
                            </form>
                    </div>
                </div>
                
            </div>
        </div>
    </div>

</body>
<script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  

    <script  src="js/index.js"></script>
    </html>