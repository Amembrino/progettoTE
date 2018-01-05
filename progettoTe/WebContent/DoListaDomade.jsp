 <%@page import="GestDomTirocino.*"%>

<jsp:useBean id="domanda" 
    class="bean.DomandaTirocinio"
     scope="request"/>
    
     <jsp:useBean id="listaDomande" 
    class="bean.ListDomandeTiro"
     scope="request"/>
     
 <jsp:useBean id="tutorAz" 
    class="bean.tutorAz"
     scope="session"/>   
     
  <%
  DoDomaTirociDAO dom= new DoDomaTirociDAO();
  
  dom.fillDomadeTiroTA(listaDomande, tutorAz.getEmail().toString() );
   
  %>
    <jsp:forward page="ViewDomandetirocinio.jsp"></jsp:forward>