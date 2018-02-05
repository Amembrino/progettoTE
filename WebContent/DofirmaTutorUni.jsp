 
<%@page import="tirocinio.domanda.gestore.DomaTirociDao"%>
 <jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 
 

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
  DomaTirociDao dom= new  DomaTirociDao();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaTuni(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
<jsp:forward page="Homepage.jsp" />