<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="dirDip" class="bean.DirettoreDip" scope="session"/> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Direttore Dipartimento</title>

 </head>
 


<body>


<div class="main">
  <h2>home Direttore DIPARTIMENTO</h2>
  <% out.print("<p>  direttore :"+ dirDip.getEmail()+"</p>");%>
  
 </div>

</body>
</html>