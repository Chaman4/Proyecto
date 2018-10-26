<%-- 
    Document   : modificarperfiladmin
    Created on : 23/10/2018, 01:53:04 AM
    Author     : Jorge C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
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
  </style>
    <link rel="shortcut icon" type="image/png" href="imagenes/LOGO.png">
<title>Padish | Donando por un México mejor</title>

   <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/simple-sidebar.css" rel="stylesheet">
</head>

<body>
          <div class="w3-top">
  <div class="w3-bar w3-light w3-card" style="background-color: white; ">
  <a href="modificarperfiladmin.jsp" class="w3-bar-item w3-button" id="loginform"><i class="fa fa-user-circle" aria-hidden="true"></i>Mi Perfil</a>
    <div class="w3-right w3-hide-small">
    	<div id="navthing">
    
    <a href="sesioniniciadaadmin.jsp" class="w3-bar-item w3-button"><i class="fa fa-exclamation" aria-hidden="true"></i> Quejas</a>
    <a href="gestionusuarios.jsp" class="w3-bar-item w3-button"><i class="fa fa-user-times" aria-hidden="true"></i> Usuarios</a>
    <a href="gestionanuncios.jsp" class="w3-bar-item w3-button"><i class="fa fa-cloud-upload" aria-hidden="true"></i> Anuncios</a>
        <a href="cerrarsesion" class="w3-bar-item w3-button"><i class="fa fa-sign-out" aria-hidden="true"></i> Cerrar Sesión</a>
    </div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
</div>
  </div>
 </div>
    <br><br><br><br><br><br>
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
    