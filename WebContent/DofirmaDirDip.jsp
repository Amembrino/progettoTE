  
 
<%@page import="tirocinio.domanda.gestore.DomandaTirociDao"%>
 <jsp:useBean id="DirettoreDip" class="bean.DirettoreDip" scope="session"/> 
 

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
 DomandaTirociDao doma= new  DomandaTirociDao();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  doma.firmaDirDip(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
  
<jsp:forward page="ViewDomadetirocinio.jsp"/>
