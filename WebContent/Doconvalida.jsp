<%@page import="tirocinio.registro.gestore.RegistroDao"%>
 
 
     
     <%
     RegistroDao reg= new RegistroDao();
     int id=Integer.parseInt(request.getParameter("id"));
     
     reg.convalidaTaz(id); 
     %> 
     <jsp:forward page="Homepage.jsp" />