<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Tutor uni</title>
</head>
<link rel="stylesheet" type="text/css" href="style.css">
 
<body>


<body>
 

<div class="main">
  <h2>home Tutor UNIVER</h2>
   <% out.print("<p>   "+TutorUni.getEmail().toString()+"</p>");%> 
</div>  
  
</body>
</html>