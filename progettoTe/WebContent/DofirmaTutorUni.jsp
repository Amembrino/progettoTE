 
<%@page import="GestDomTirocino.DomaTirociDAO"%>
 <jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 
 
<jsp:useBean id="domanda"
             class="bean.DomandaTirocinio"
             scope="request" />

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
  DomaTirociDAO dom= new  DomaTirociDAO();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaTuni(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
<jsp:forward page="HomeTurorUni.jsp" />