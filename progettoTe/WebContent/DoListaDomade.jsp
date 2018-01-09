 <%@page import="GestDomTirocino.DoDomaTirociDAO"%>

  <jsp:useBean id="listaDomande" 
    class="bean.ListDomandeTiro"
     scope="request"/>
     
 <jsp:useBean id="tutorAz" 
    class="bean.tutorAz"
     scope="session"/>   
     
  <%
 String taz= tutorAz.getEmail();
  DoDomaTirociDAO dom= new DoDomaTirociDAO();
  dom.fillListaDomande(listaDomande, taz);
   
  %>
    <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>