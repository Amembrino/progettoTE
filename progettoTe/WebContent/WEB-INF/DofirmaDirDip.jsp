 
 /**Firma direttore dipartimento con creazione del nuovo registro*/
 
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
 /** home direttore da creare*/
<jsp:forward page="HomeDirDip.jsp" />