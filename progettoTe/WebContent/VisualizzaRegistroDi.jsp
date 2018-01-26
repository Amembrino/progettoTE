<%@page import="java.sql.*" %>
<%@page import="Db.Connector" %>
  <jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 
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
  
<jsp:include page="menuTutorUni.jsp"></jsp:include>
<h1>Domanda di Tirocinio</h1>
        <jsp:include page="HomeTurorUni.jsp"></jsp:include>

<div class="main">

<form name="richiediTirocinioform" action="doVisualizzaRegistroDi.jsp" method="post">
 

   <br>email
  <input type="text" value="<%out.print(TutorUni.getEmail()); %>" name="Email"> 




<fieldset>  <legend>Tirocinante</legend>
 <select name="Tirocinante">
 <%
 Connection con= Connector.getConnection();
 ResultSet rs;
	
 String query="SELECT registro_tirocinio.Tirocinante_Email FROM registro_tirocinio, domanda_di_tirocinio WHERE registro_tirocinio.Tirocinante_Email=domanda_di_tirocinio.TirocinanteEmail AND domanda_di_tirocinio.Tutor_UniversitarioEmail='"+TutorUni.getEmail()+"' ";
	try{
		java.sql.Statement  stmt = con.createStatement();
		 rs=stmt.executeQuery(query);
		 
while(rs.next())
		 {
	String Tem=rs.getString("Tirocinante_Email");
	%>
	 
	<option value="<%out.print(Tem);%>"><% out.print(Tem);%></option> <%
		 }
stmt.close();
con.close();
	 }
	catch(Exception ex){System.out.println(ex);
	 }
	 %>
      
        
 </select> 

 </fieldset>

  

  
 
 
 
 
 <input type="submit" value="submit">
</form>






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
    <h4>Lorem</h4>
    <p>Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. </p>
  </aside>
 <footer>
    <p> Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. </p>
    <address>
      TirocinioEasy
    </address>
  </footer>
<!-- end .container --></div>
</body>
</html>