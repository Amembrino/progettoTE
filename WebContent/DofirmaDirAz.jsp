  

<%@page import="tirocinio.domanda.gestore.DomaTirociDao"%>
 <jsp:useBean id="DirAz" class="bean.DirigenteAzienda" scope="session"/> 
 

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
 // richiamo la classe che gestisce le domandedi tirocinio
 DomaTirociDao dom = new DomaTirociDao();
	
 
 //id della domanda da firmsre che passo 
int id=Integer.parseInt(request.getParameter("iddomanda"));

 // metodo che appone la firma alla domanda di tirocinio
 dom.firmaDirAz(id);
 
  
 %>
<jsp:forward page="ViewDomadetirocinio.jsp" />