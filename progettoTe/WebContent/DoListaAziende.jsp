 <%@page import="bean.ListaAziendeDAO"%>


<jsp:useBean id="lista"
 class="bean.ListaAziende"  
 scope="request" />
     
  
     
  <%
 
  ListaAziendeDAO Az= new ListaAziendeDAO();
  Az.fillListaAziende1(lista);
   
  %>
    <jsp:forward page="viewListaAziende.jsp"></jsp:forward>