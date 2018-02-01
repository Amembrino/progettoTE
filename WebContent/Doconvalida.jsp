<%@page import="tirocinio.registro.gestore.RegistroDao"%>
 
  <jsp:useBean id="listaReg"
             class="tirocinio.registro.gestore.ListaRegistri"
             scope="request" />
    
     
     <%
     RegistroDao reg= new RegistroDao();
     int id=Integer.parseInt(request.getParameter("iddomanda"));
     
     reg.convalidaTaz(id); 
     %> 
     <jsp:forward page="Homepage.jsp" />