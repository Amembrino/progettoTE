 
<%@page import="tirocinio.domanda.gestore.DomaTirociDao"%>

<jsp:useBean id="tutorAz" class="bean.TutorAz" scope="session"/>
  
  
 <%
  DomaTirociDao dom= new  DomaTirociDao();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaTAz(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
 <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>
    