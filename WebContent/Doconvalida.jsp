<%@page import="tirocinio.registro.gestore.RegistroDao"%>
 
  <jsp:useBean id="attivit�" 
class="bean.Attivit�" 
scope="session"/>
 
 
 
     <%
     RegistroDao regi= new RegistroDao();
     int id=Integer.parseInt(request.getParameter("id"));
     
     regi.convalidaTaz(id); 
     %> 
     <jsp:forward page="Homepage.jsp" />