 
<%@page import="tirocinio.domanda.gestore.DomaTirociDAO"%>

<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
  
  
 <%
  DomaTirociDAO dom= new  DomaTirociDAO();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaTAz(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
 <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>
    