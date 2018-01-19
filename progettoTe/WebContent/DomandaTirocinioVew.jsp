<%@page import="java.sql.*" %>
<%@page import="Db.Connector" %>
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

<form name="richiediTirocinioform" action="doDomanda.jsp" method="post">
 
  nome<input type="text"    name="nome">   <br>
  
   cognome<input type="text"  name="cognome">  <br>
   <br>email
  <input type="text"  name="Email"> 


<fieldset>  <legend>Azienda</legend>
 <select name="azienda">
 <%
 Connection con3= Connector.getConnection();
 ResultSet rs3;
	
 String query3="SELECT azienda.nome FROM azienda";
	try{
		java.sql.Statement  stmt3 = con3.createStatement();
		 rs3=stmt3.executeQuery(query3);
		 
while(rs3.next())
		 {
	String nome=rs3.getString("nome");
	%>
	 
	<option value="<%out.print(nome);%>"><% out.print(nome);%></option> <%
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
 ResultSet rs;
	
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

 </fieldset>
 
 <fieldset>  <legend>Tutor Aziendale</legend>
 <select name="tutorAzi">
 <%
 Connection con2= Connector.getConnection();
 ResultSet rs2;
	
 String query2="SELECT tutor_aziendale.Email, tutor_aziendale.Cognome FROM tutor_aziendale";
	try{
		java.sql.Statement  stmt2 = con2.createStatement();
		 rs=stmt2.executeQuery(query2);
		 
while(rs.next())
		 {
	String email=rs.getString("Email");
	System.out.println(email);
	String Cognome=rs.getString("Cognome");
	 
	%>
	 
	<option value ="<%out.print(email);%>"><% out.print(Cognome);%></option> <%
		 }
stmt2.close();
con2.close();
	 }
	catch(Exception ex){
ex.printStackTrace();
	 }
	 %>
      
        
 </select> 

 </fieldset>
 
 
 <input type="submit" value="submit">
</form>



</div>  


 <div id="searchresult">        
     <dl>  </div>
    <section></section>
    <section> </section>
    
  <!-- end .content --></article>
  <article class="content">
    
    <section></section>
    <section> </section>
    
  <!-- end .content --></article>
  <aside>
    <h4>Sfondi</h4>
    <p>Normalmente, il colore di sfondo di un elemento di blocco viene visualizzato solo per tutta la lunghezza del contenuto. Se desiderate visualizzare una linea di divisione anziché un colore, inserite un bordo sul lato del blocco .content  (ma solo se esso conterrà sempre una quantità maggiore di contenuto).</p>
  </aside>
  <footer>
    <p>Ciao a tutti</p>
    <address>
      Contenuto indirizzo
    </address>
  </footer>
<!-- end .container --></div>
</body>
</html>
