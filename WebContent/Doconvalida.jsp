<%@page import="tirocinio.registro.gestore.RegistroDAO"%>
 
  <jsp:useBean id="listaReg"
             class="tirocinio.registro.gestore.ListaRegistri"
             scope="request" />
    
     
     <%
     RegistroDAO reg= new RegistroDAO();
     int id=Integer.parseInt(request.getParameter("iddomanda"));
     
   boolean x = reg.convalidaTaz(id);
   if (x==true){
	   %>   <jsp:forward page="ConvalidaRegistriView.jsp" />  <%  
   }
   %> 
     <jsp:forward page="Homepage.jsp" />