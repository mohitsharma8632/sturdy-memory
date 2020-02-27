<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    
    if(session.getAttribute("email")==null){  
    	response.sendRedirect("index.jsp");
    }  
    
    
    %>
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap-4.3.1-dist\css\bootstrap.css">
  <script src="bootstrap-4.3.1-dist\bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Update done</h1>

</div>

<%
Thread.sleep(3000);
response.sendRedirect("welcome.jsp");
%>



</body>
</html>
