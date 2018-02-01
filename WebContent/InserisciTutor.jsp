<%@page import=" tirocinio.registro.gestore.RegistroDao"%>
<%@page import="bean.DomandaTirocinio"%>



<%@page import="java.sql.*" %>
<%@page import="db.Connector" %>
  <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Domanda Tirocinio</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a>
  </header>
  
<jsp:include page="menuStudente.jsp"></jsp:include>
<h1>Domanda di Tirocinio</h1>
        <jsp:include page="HomeTirocinante.jsp"></jsp:include>

<div class="main">

 
<form name="richiediTirocinioform2" action="doDomanda.jsp" method="post">
 <table>
<%
String email= request.getParameter("Email");
String azienda= request.getParameter("azienda");
String tutorUni= request.getParameter("tutorUni"); %>


   <tr> <td>email</td>
  <td><input type="text" value="<% out.print(email); %>" name="Email" readonly> </td>
  </tr>
   <tr> <td> azienda</td>
  <td><input type="text" value="<% out.print(azienda); %>" name="azienda" readonly> </td>
  </tr>
  <tr> <td> Tutor universitario </td>
 <td><input type="text" value="<% out.print(tutorUni); %>" name="tutorUni" readonly> </td>
  </tr> 
  
  
  
 
    <legend>Tutor Aziendale</legend>
 <select name="tutorAzi">
 <%
 ResultSet rs;
 Connection con2= Connector.getConnection();
	
 String query2="SELECT tutor_aziendale.Email, tutor_aziendale.Cognome FROM azienda, tutor_aziendale WHERE tutor_aziendale.Email=azienda.Tutor_AziendaleEmail AND azienda.Nome='"+azienda+ "'";
	try{
		java.sql.Statement  stmt2 = con2.createStatement();
		 rs=stmt2.executeQuery(query2);
		 
while(rs.next())
		 {
	String EmDir=rs.getString("Email");
	String Cognome=rs.getString("Cognome");
	 
	%>
	 
	<option value ="<%out.print(EmDir);%>" ><% out.print(Cognome);%></option> <%
		 }
stmt2.close();
con2.close();
	 }
	catch(Exception ex){
ex.printStackTrace();
	 }
	 %>
      
        
 </select> 

 
 
 
 <tr><td><input type="submit" value="submit"> </td></tr>

  </table>
</form>


</div> 
 
</body>
</html>
  
