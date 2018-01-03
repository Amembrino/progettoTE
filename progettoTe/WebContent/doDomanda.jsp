 
<%@page import=" GestDomTirocino.DoDomaTirociDAO" %>
<jsp:useBean id="Data" class="bean.DomandaTirocinio" scope="request"/>
 
<jsp:setProperty name="Data" property="*"  /> 

<%

DoDomaTirociDAO domd= new DoDomaTirociDAO();

 String email= request.getParameter("Email");
 String azienda= request.getParameter("azienda");
 String TuEmail= request.getParameter("tutorUni");
 String tAzEmail= request.getParameter("tutorAzi");
  
 Data.setAttivato(false);
 Data.setTirocinanteEmail(email );
 Data.setAzienda(azienda);
 Data.setTutoUnirEmanil(TuEmail);
 Data.setTutoAzrEmanil(tAzEmail );
 out.println(azienda);
 domd.compilaDoma(Data );
 
 %>
