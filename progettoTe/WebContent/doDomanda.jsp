 
<%@page import=" GestDomTirocino.DomaTirociDAO"%>
<%@page import="bean.DomandaTirocinio"%>

<jsp:useBean id="doma" class="bean.DomandaTirocinio" scope="request"/>
 
 

<%
String nome= request.getParameter("nome");
String email= request.getParameter("Email");
String cognome= request.getParameter("cognome");
String azienda= request.getParameter("azienda");
String tutorUni= request.getParameter("tutorUni");
String tutorAzi= request.getParameter("tutorAzi");
 

doma.setAutore(nome);
doma.setTirocinanteEmail(email);
doma.setAzienda(azienda);
doma.setTutoAzrEmanil(tutorAzi);
doma.setTutoUnirEmanil(tutorUni );

DomaTirociDAO dom= new DomaTirociDAO();
dom.compilaDoma(doma);


 %>
 
