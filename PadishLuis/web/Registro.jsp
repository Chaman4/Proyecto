<%@page import="BD.consultas"%>
<%
System.out.println("dddddddddddddddddddddddd");
%>


<!DOCTYPE html>
<html lang="en">
<head>
	<link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style1.css">
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
  	background: url(imagenes/silla.jpg);
  	background-size: cover;
  	font-family: 'Titillium Web', sans-serif;

  }
  </style>
  <title>Padish</title>
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
        
           
        
        
        <div class="w3-top">
  <div class="w3-bar w3-light w3-card" style="background-color: rgb(255, 255, 255); ">
    <a href="#menu-toggle" class="w3-bar-item w3-button w3-wide" id="menu-toggle"><i class="fa fa-search" aria-hidden="true"></i>BUSQUEDA</a>
    <div class="w3-right w3-hide-small">
        <div id="navthing">
    <a href="index.html" class="w3-bar-item w3-button"><i class="fa fa-home" aria-hidden="true"></i>REGRESAR</a>
    </div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
</div>
</div>
</div>
 </div>
 <br><br>
    <!-- /#wrapper -->
   <div class="form">
      
      <h1>REGISTRO</h1>
      <BR><BR>
      
      <div class="tab-content">
        <div id="signup">   
          
          
          <form id="form-login" action="registro" method="post" autocomplete="off">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
               </label> 
              
              <input type="text" required autocomplete="off" name="nombre" id="nombre" placeholder="Nombre(s)" />

            </div>
        
            <div class="field-wrap">
              <label>
               
              </label>
              <input type="text"required name="usuario" id="usuario" autocomplete="off" placeholder="Usuario"/>
            </div>
          </div>

          <div class="field-wrap">
            <label>
              
            </label>
            <input type="email"required id="correo" name="correo" autocomplete="off" placeholder="Email"/>
          </div>
          <div class="field-wrap">
            <label>
             
            </label>
            <input name="curp" type="text" id="curp" required autocomplete="off" placeholder="CURP"/>
          </div>
          <div class="field-wrap">
            <label>
            
            </label>
            
            <label>
              
            </label>
            <input name="direccion" type="text" id="direccion"required autocomplete="off" placeholder="Direccion Completa"/>
          </div>
          <div class="top-row">

            <div class="field-wrap">
            <label>
              
            </label>
            <input name="contrasena" type="password" id="contrasena"required autocomplete="off" placeholder="Contraseña"/>
          </div>


              <input name="contrasena2" type="password" id="confirmacion" required autocomplete="off" placeholder="Confirmar Contraseña"/>
            </div>
        
            
        </div>
        <input name="estado" type="hidden" id="estado" disabled="" value="1" required=""></p>
         <a href="inicio.html"> <button type="submit" class="button "/> <span>REGISTRARME</span></button></a>
          
          </form>

        </div>
        
        <div id="login">   
          
          
          
          
          </form>

        </div>
        
      </div>










    <!-- Bootstrap core JavaScript -->
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

  

    <script  src="js/index1.js"></script>


</body>
</html>