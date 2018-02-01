<%@page import="tirocinio.registro.gestore.RegistroDao"%>
 
  <jsp:useBean id="listaReg"
             class="tirocinio.registro.gestore.ListaRegistri"
             scope="request" />
    
     
     <%
     RegistroDao reg= new RegistroDao();
     int id=Integer.parseInt(request.getParameter("iddomanda"));
     
   boolean x = reg.convalidaTaz(id);
   if (x==true){
	   %>   <jsp:forward page="ConvalidaRegistriView.jsp" />  <%  
   }
   %> 
     <jsp:forward page="Homepage.jsp" />