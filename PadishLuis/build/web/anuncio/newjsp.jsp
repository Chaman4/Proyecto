<%-- 
    Document   : newjsp
    Created on : 17/09/2018, 12:12:24 PM
    Author     : Luigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int gg=0;
        try{
            System.out.println("yyyyyyyyy");
            HttpSession ses = request.getSession();
            System.out.println("yyyyyyyyy");
            gg = (Integer)ses.getAttribute("id");
            System.out.println("yyyyyyyyy");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        %>
        <%=gg%>
    </body>
</html>
