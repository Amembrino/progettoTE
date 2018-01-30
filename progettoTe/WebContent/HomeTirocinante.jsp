<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Tirocinante</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>


<div class="main">
   <%
   out.print("<p>benvenuto carissimo studente :"+tirocinan.getEmail()+"</p>");
   %>
  
  </div>
</body>
</html>