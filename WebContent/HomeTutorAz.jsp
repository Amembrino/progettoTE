<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Tutor Aziendale</title>

 
<link rel="stylesheet" type="text/css" href="style.css">
 
</head>
<body>

 

<div class="main">
 
    <% out.print("<p>   "+tutorAz.getEmail().toString()+"</p>");%>
   </div>
  
</body>
</html>