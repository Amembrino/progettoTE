<%@page import="gestRegTir.RegistroDAO"%>
 
  <jsp:useBean id="listaReg"
             class="gestRegTir.ListaRegistri"
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