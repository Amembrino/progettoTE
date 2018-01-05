<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="dirDip" class="bean.DirettoreDip" scope="session"/> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Direttore Dipartimento</title>
<style>
.sidenav {
    width: 130px;
    position: fixed;
    z-index: 1;
    top: 20px;
    left: 10px;
    background: #eee;
    overflow-x: hidden;
    padding: 8px 0;
}

.sidenav a {
    padding: 6px 8px 6px 16px;
    text-decoration: none;
    font-size: 25px;
    color: #2196F3;
    display: block;
}

.sidenav a:hover {
    color: #064579;
}

.main {
    margin-left: 140px; /* Same width as the sidebar + left position in px */
    font-size: 28px; /* Increased text to enable scrolling */
    padding: 0px 10px;
}

</style>
 </head>
 


<body>

<div class="sidenav">
  <a href="">logout</a>
  <a href="DomandaTirocinioVew.jsp">ATTIVA tirocinio</a>
 
</div>

<div class="main">
  <h2>home Direttore dIPARTIMENTO</h2>
  <% out.print("<p>benvenuto carissimo direttore :"+ dirDip.getEmail()+"</p>");%>
  
 </div>

</body>
</html>