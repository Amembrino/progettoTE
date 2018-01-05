 <%@page import="GestDomTirocino.*"%>

<jsp:useBean id="domanda" 
    class="bean.DomandaTirocinio"
     scope="request"/>
    
     <jsp:useBean id="lista" 
    class="bean.ListDomandeTiro"
     scope="session"/>
     
 <jsp:useBean id="tutorAz" 
    class="bean.tutorAz"
     scope="session"/>   
     
  <%
  DoDomaTirociDAO dom= new DoDomaTirociDAO();
  dom.fillDomadeTiroTA(lista, tutorAz.getEmail() );
    %>
    <jsp:forward page="ViewDomandetirocinio.jsp"></jsp:forward>