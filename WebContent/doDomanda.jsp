
<%@page import=" tirocinio.domanda.gestore.DomaTirociDAO"%>
<%@page import="bean.DomandaTirocinio"%>

 
<%
//String nome= request.getParameter("nome");
String email= request.getParameter("Email");
//String cognome= request.getParameter("cognome");
String azienda= request.getParameter("azienda");
String tutorUni= request.getParameter("tutorUni");
String tutorAzi= request.getParameter("tutorAzi");
  
System.out.println(azienda);
System.out.println(email);
System.out.println(tutorUni);
System.out.println(tutorAzi);
 
//doma.setAutore(nome);
  DomandaTirocinio doma=new DomandaTirocinio(1,0,0,0,0,tutorUni,email,tutorAzi);
 
//doma.setTirocinanteEmail(email);
//doma.setAzienda(azienda);
//doma.setTutoAzrEmanil(tutorAzi);
//doma.setTutoUnirEmanil(tutorUni );

DomaTirociDAO dom= new DomaTirociDAO();
dom.compilaDoma(doma); 
 %>

 
 
 
<jsp:forward page="Homepage.jsp" />
 
