 
<%@page import="tirocinio.domanda.gestore.DomandaTirociDao"%>

<jsp:useBean id="tutorAz" class="bean.TutorAz" scope="session"/>
  
  
 <%
 DomandaTirociDao dom= new  DomandaTirociDao();
 
 int id=Integer.parseInt(request.getParameter("iddomanda"));
  dom.firmaTAz(id);
 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
 <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>
    