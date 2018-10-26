<%-- 
    Document   : registraranuncio
    Created on : 22/09/2018, 02:15:38 PM
    Author     : Luigi
--%>

<%@page import="BD.consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
try{
    HttpSession sesion = request.getSession();
    int dsfsdf= (Integer) sesion.getAttribute("id");
    System.out.println(dsfsdf);
}catch(Exception e){
    
        response.sendRedirect("index.html");
}%>
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
  .bgimg-1 {
    background-position: center;
    background-size: cover;
    background-image: url("DA WAE.jpg");
    min-height: 110%;
  }
  .dropdown {
    position: relative;
    display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #063b8ba9;
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
  .w3-bar .w3-button {
    padding: 16px;
  }
  body{
  	background: url(imagenes/apreton.jpg);
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
    <a href="#menu-toggle" class="w3-bar-item w3-button w3-wide" id="menu-toggle"><i class="fa fa-search" aria-hidden="true"></i>BUSQUEDA</a>
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
 <br><br>
    <!-- /#wrapper -->
   <div class="form">
      
      <h1>PUBLICAR</h1>
      <BR><BR>
      
      <div class="tab-content">
        <div id="signup">   
          
          
          <form action="registraranuncio" >
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
               </label> 
              
              <input type="text" name="titulo" id="titulo" required="" required autocomplete="off" placeholder="Nombre Anuncio" />

            </div>
        
            
          </div>

          <div class="field-wrap">
            <label>
              
            </label>
              <textarea class="estilotextarea" style="width:500px;   border: none;
  border-bottom: 1px solid rgba(0, 0, 0, 0.801);
  background: transparent;
  outline: none;
  height: 100px;
  color: rgb(102, 102, 102);
  font-size: 20px;
    " name="des" id="des" placeholder="Descripcion" required=""></textarea>
          </div>
          <div class="field-wrap">
              
              <br><br><br>
            <label>
                <h3 style="font-size: 20px;
    color:black;">Tipo &nbsp &nbsp&nbsp&nbsp</h3>
            </label>
            <select name="tipo" style=" border: none;
  border-bottom: 1px solid rgba(0, 0, 0, 0.801);
  background: transparent;
  outline: none;
  color: rgb(102, 102, 102);
  font-size: 20px;"id="tipo" required="">
                <%
                String lis[] = consultas.listtipo();
                for (int i = 0; i < lis.length; i++) {
                        out.print("<option value="+(i+1)+">"+lis[i]+"</option>");
                    }
                %>
            </select>
          </div>
            <br><br>
            
             <!--
             Foto: <input type="file" accept="image/png, image/jpeg" id="foto" name="foto">
                <form method="POST" action="Guardarimg" class="form-horizontal" name="IngresarImg" enctype="multipart/form-data" onpaste="return false" ondrop="return false" ondrag="return false">
             -->
         <label>
                <h3 style="font-size: 20px;
    color: black;">Subir Foto</h3>
    <input type="file" accept="image/png, image/jpeg" id="foto" name="foto">
          <form method="POST" action="Guardarimg" class="form-horizontal" name="IngresarImg" enctype="multipart/form-data" onpaste="return false" ondrop="return false" ondrag="return false">
            </label>
             
           
         </div> 
          <button type="submit" class="button "/> <span>SUBIR ANUNCIO</span></button>
          
          </form>

        </div>
        
        <div id="login">   
          
          
          
          

        </div>
        
      </div>
   </div>
</body>
</html>