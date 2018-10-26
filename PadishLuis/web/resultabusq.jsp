<%-- 
    Document   : resultabusq
    Created on : 11/10/2018, 09:22:16 AM
    Author     : Luigi
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 try{
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
  </style>

    <title>Padish</title>

    <!-- Bootstrap core CSS -->
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



          <div class="w3-top">
  <div class="w3-bar w3-light w3-card" style="background-color: #3B929E; ">
    <a href="#menu-toggle" class="w3-bar-item w3-button w3-wide" id="menu-toggle"><i class="fa fa-search" aria-hidden="true"></i>BUSQUEDA</a>
    <div class="w3-right w3-hide-small">
    	<div id="navthing">
    <a href="Registro.jsp" class="w3-bar-item w3-button"><i class="fa fa-user-plus" aria-hidden="true"></i>  REGISTRARSE</a>
    <a href="#" class="w3-bar-item w3-button" id="loginform"><i class="fa fa-user" aria-hidden="true"></i>  INICIAR SESION</a>
    <a href="index.html#about" class="w3-bar-item w3-button"><i class="fa fa-gg" aria-hidden="true"></i> ACERCA DE</a>
    <a href="index.html#contact" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i>   CONTACTANOS</a>
    </div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
</div>

</div>
<div class="login w3-right">
      <div class="formholder">
        <div class="randompad">
           <fieldset>
             <form id="form-login" action="login" method="post" autocomplete="off">
               <label name="email">Email</label>
               <input name="correo" type="email" id="correo" placeholder="Ingresa Usuario" autofocus="" required="">
               <label name="password">Contraseña</label>
               <input name="contrasena" type="password" id="contrasena" placeholder="Ingresa Contraseña" required="">
               <input type="submit" value="Ingresar" />
            </form>
           </fieldset>
        </div>
      </div>
    </div>
</div>


        <br>
        <br>
        <br>
        <br>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <table style="width: 100%;">

    <%
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
                %>
                <tr>
    <%
            }
        %>
        
        <td align="center" style="padding: 10px;">
                
       
            
            
            <!--out.println("Titulo: "+list.get(i).getTitulo());
            out.println("<br>");
            out.println("Anunciante: "+list.get(i).getUsuario());
            out.println("<br>");
            out.println("Fecha de publicacion: "+list.get(i).getFecha());
            out.println("<br>");
            out.println("Tipo de articulo: "+list.get(i).getTipo());
            out.println("<br>");
            out.println("Descripcion: "+list.get(i).getDescripcion());
            out.println("<br><br><br>");-->
            <div class="card" style="width: 20rem;" align="left">
  <div class="card-body">
      <h5 class="card-title"><%=list.get(i).getTitulo()%></h5>
    <h6 class="card-subtitle mb-2 text-muted"><%=list.get(i).getTipo()%></h6>
    <h6 class="card-subtitle mb-2 text-muted"><%=list.get(i).getDisponible()%></h6>
    <%
    String desc = list.get(i).getDescripcion();
    if (desc.length() > 50) {
        desc="";
            for (int k = 0; k < 47; k++) {
                    desc += list.get(i).getDescripcion().charAt(k);
                }
            desc += "...";
        }
    %>
    <p class="card-text"><%=desc%></p>
    <p class="card-text">Publicado el dia <%=list.get(i).getFecha()%> por <%=list.get(i).getUsuario()%></p>
    <p class="card-text"><%=list.get(i).getMetodoenvio()%> </p>
    
    
    
    <a class="card-link" href="#" data-toggle="modal" data-target="#modal<%=i%>">Mostar Articulo</a>
    
    <!-- Button trigger modal 
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
  Launch demo modal
</button>

    
    
<!-- Modal -->
<div class="modal fade" id="modal<%=i%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
          
          <h5 class="modal-title" id="exampleModalLongTitle"><%=list.get(i).getTitulo()%></h5>
          
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
          
          
          
      </div>
          
      <div class="modal-body">
          
        <table style="width:100%">
            <td style="width:250px; text-align: initial; vertical-align: top;">
               
                
                <%=list.get(i).getDescripcion()%>
                <br>
                <br>
                Proximamente imagen 100% falsa, fake, sin link mega
               
               
            </td>
            <td style="width:170px">
                <h6 class="card-subtitle mb-2 text-muted">Anunciante:</h6>
                    <button type="button" class="btn btn-outline-primary"><%=list.get(i).getUsuario()%></button>
                    
                <br><br>
                <h6 class="card-subtitle mb-2 text-muted">Detalles:</h6>
                
                <%
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
                %>
                
                
                <a class="btn btn-outline-secondary" href="Busca?<%=tipo%>=true&&in=" style="width: 160px" align="left"><%=list.get(i).getDisponible()%></a>
                
                
                
                
                <br>
                <%
                    
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
                   %>
                   <a class="btn btn-outline-secondary" href="<%=link%>" style="width: 160px" align="left"><%=list.get(i).getTipo()%></a>
                <br>
                
                
                <%
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
                %>
                <a class="btn btn-outline-secondary" href="<%=link%>" style="width: 160px" align="left"><%=list.get(i).getMetodoenvio()%></a>
            </td>
        </table>
          
      </div>
      <div class="modal-footer">
        
          
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Solicitar articulo</button>
      </div>
    </div>
  </div>
</div>
    


    
  </div>
</div>


                        </td>
                        
            <%
                if (j==3) {
            %>
                </tr>
                <%
                    j=-1;   
                }
                j++;
        }

%>
</table>

        <%
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
            %>
<div class="jumbotron">
  <h1 class="display-4">Lo sentimos</h1>
  <p class="lead">No pudimos hallar ningun articulo con las caracteristicas que solicito</p>
  <hr class="my-4">
  <p>Busque articulos con otras caracteristicas</p>
</div>
        <%
        }else{
    %> 
    
    
    
    <%
    if (list.size()>8) {
         
    %>
    <nav aria-label="Page navigation example">
  <ul class="pagination justify-content-end">
      
      <%
      if (repeticiones !=0) {
              %>
      <li class="page-item">
      <a class="page-link" href="resultabusq.jsp?pag=<%=(repeticiones-1)%>" tabindex="-1">Anterior</a>
    </li>
      <%
          }
      %>
    
    
    
    
    <%
        int menus = list.size()/8;
        if (list.size()%8 != 0) {
                menus++;
            }
        
        for (int i = 0; i < menus; i++) {
         
    %>
    <li class="page-item"><a class="page-link" href="resultabusq.jsp?pag=<%=(i)%>"><%=(i+1)%></a></li>
    <%   
        }
if (menus != (repeticiones+1)) {
       %>
    
    <li class="page-item">
      <a class="page-link" href="resultabusq.jsp?pag=<%=(repeticiones+1)%>">Siguiente</a>
    </li>
    
  
        <% 
    }
%>
        </ul>
    </nav>
        <%
   
        }
    }%>
    
</body>


<script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Menu Toggle Script -->
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

<%
}catch(Exception err){
System.out.println(err.getMessage());
}
%>