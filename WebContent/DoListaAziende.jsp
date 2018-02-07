 <%@page import="tirocinio.domanda.gestore.ListaAziendeDao"%>
 <%@page import="bean.Azienda"%>

<jsp:useBean id="lista"
 class="bean.ListaAziende"  
 scope="request" />
     
  
     
  <%
   ListaAziendeDao Az= new ListaAziendeDao();
  Az.fillListaAziende(lista);
   
  %>
    <jsp:forward page="viewListaAziende.jsp"></jsp:forward>