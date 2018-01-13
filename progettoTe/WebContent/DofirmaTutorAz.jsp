 
<%@page import="GestDomTirocino.DoDomaTirociDAO"%>

<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
 
<jsp:useBean id="domanda"
             class="bean.DomandaTirocinio"
             scope="request" />

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
 DoDomaTirociDAO dom= new DoDomaTirociDAO();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaTAz(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
<jsp:forward page="firmaDomanda.jsp" />