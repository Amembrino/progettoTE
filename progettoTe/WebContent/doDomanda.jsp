 
<%@page import=" GestDomTirocino.DomaTirociDAO" %>
<jsp:useBean id="Data" class="bean.DomandaTirocinio" scope="request"/>
 
<jsp:setProperty name="Data" property="*"  /> 

<%

 DomaTirociDAO domd= new  DomaTirociDAO();

 String email= request.getParameter("Email");
 String azienda= request.getParameter("azienda");
 String TuEmail= request.getParameter("tutorUni");
 String tAzEmail= request.getParameter("tutorAzi");
  
  Data.setAttivato(0);  
 Data.setTirocinanteEmail(email );
 Data.setAzienda(azienda);
 Data.setTutoUnirEmanil(TuEmail);
 Data.setTutoAzrEmanil(tAzEmail );
 out.println(azienda);
 domd.compilaDoma(Data );
 
 %>
