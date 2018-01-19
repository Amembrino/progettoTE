  
 
<%@page import="GestDomTirocino.DomaTirociDAO"%>
 <jsp:useBean id="DirettoreDip" class="bean.DirettoreDip" scope="session"/> 
 
<jsp:useBean id="domanda"
             class="bean.DomandaTirocinio"
             scope="request" />

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
  DomaTirociDAO dom= new  DomaTirociDAO();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaDirDip(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
  
<jsp:forward page="Homedir_dipartimento.jsp" />