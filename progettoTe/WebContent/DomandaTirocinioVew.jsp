<%@page import="java.sql.*" %>
<%@page import="Db.Connector" %>
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

<form name="richiediTirocinioform" action="InserisciTutor.jsp" method="post">
 

  email
  <input type="text" value="<%out.print(tirocinan.getEmail()); %>" name="Email"> 

     <br>

<fieldset>  <legend>Azienda</legend>
 <select name="azienda">
 <%
 Connection con3= Connector.getConnection();
 ResultSet rs;
	
 String query3="SELECT azienda.nome FROM azienda";
	try{
		java.sql.Statement  stmt3 = con3.createStatement();
		 rs=stmt3.executeQuery(query3);
		 
while(rs.next())
		 {
	String azienda=rs.getString("nome");
	%>
	 
	<option value="<%out.print(azienda);%>"><% out.print(azienda);%></option> <%
		 }
stmt3.close();
con3.close();
	 }
	catch(Exception ex){System.out.println(ex);
	 }
	 %>
      
        
 </select> 

 </fieldset>
 
   <fieldset>  <legend>Tutor universitario</legend>
 <select name="tutorUni">
 <%
 Connection con= Connector.getConnection();
	
 String query="SELECT tutor_universitario.Email, tutor_universitario.Cognome FROM tutor_universitario";
	try{
		java.sql.Statement  stmt = con.createStatement();
		 rs=stmt.executeQuery(query);
		 
while(rs.next()) {
	String email=rs.getString("Email");
	//System.out.println(email);
	String Cognome=rs.getString("Cognome");
	 
	%>
	 <option value ="<%out.print(email);%>"><% out.print(Cognome);%></option> 
	<%
		 }
stmt.close();
con.close();
	 }
	catch(Exception ex){ 
		 ex.printStackTrace();	
	}
	 %>
      
        
 </select> 

 
 
 <input type="submit" value="submit">
</form>



</div>  

 
</body>
</html>