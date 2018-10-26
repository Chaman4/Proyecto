<%-- 
    Document   : gestionanuncios
    Created on : 23/10/2018, 02:03:34 AM
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
        <div class="container" id="con">
            <div class="row">
                
        </div>

        
            <br>
            <table class="table table-bordered" id="tab">
                <tr id="th">
                
                    <th class="text-center" >Nombre del anuncio</th>

                    <th class="text-center" >Descripción</th>
                    
                    <th class="text-center" >Disponibilidad</th>

                    <th class="text-center" ></th>
                    

                </tr>
                
                        
                        <tr>
                            <br>
                            <td class="text-center">EJEMPLO</td>
                            <td class="text-center">EJEMPLO</td>
                            <td class="text-center">EJEMPLO</td>
                            <td class="text-center">
                                 <button class="button "/><span>Eliminar</span>  </button>
                           
                            </td>
                            
                            
                            
                            
                        </tr>
                      
            </table>
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
    </body>
</html>


