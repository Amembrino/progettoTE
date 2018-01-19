 
<%@page import="GestDomTirocino.DomaTirociDAO"%>
 <jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/> 
 
<jsp:useBean id="domanda"
             class="bean.DomandaTirocinio"
             scope="request" />

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
  DomaTirociDAO dom= new  DomaTirociDAO();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaDirAz(id);
  dom.firmaDirAz(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
<jsp:forward page="HomeDirAz.jsp" />