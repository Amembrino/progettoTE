<%@page import="gestRegTir.RegistroDAO"%>
 
  <jsp:useBean id="listaReg"
             class="gestRegTir.ListaRegistri"
             scope="request" />
    
     
     <%
     RegistroDAO reg= new RegistroDAO();
     int id=Integer.parseInt(request.getParameter("iddomanda"));
     
     reg.convalidaTaz(id); 
     %> 
     <jsp:forward page="Homepage.jsp" />