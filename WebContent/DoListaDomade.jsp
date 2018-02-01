<%@page import="bean.TutorAz"%>
<%@page import="bean.User"%>
<%@page import="bean.TutorUni"%>
<%@page import="bean.DirigenteAzienda"%>
<%@page import="tirocinio.domanda.gestore.DomaTirociDao"%>

  <jsp:useBean id="listaDomande" 
    class="bean.ListDomandeTiro"
     scope="request"/>
     
 <jsp:useBean id="user" 
    class="bean.User"
     scope="session"/>   
    
     <jsp:useBean id="tutorAz" 
    class="bean.TutorAz"
     scope="session"/>  
     
      <jsp:useBean id="TutorUni" 
    class="bean.TutorUni"
     scope="session"/>   
     
    <jsp:useBean id="dirDip" 
    class="bean.DirettoreDip" 
    scope="session"/> 
    
    <jsp:useBean id="DirAz" 
    class="bean.DirigenteAzienda" 
    scope="session"/> 
    
  
    
  <%
 String us= user.getTipoacc();
  
  out.print(DirAz.getEmail());
  
   DomaTirociDao dom= new  DomaTirociDao();
  
   if( us.equals("tutor_aziendale")){
	  
  dom.fillDomadeTiroTA_DB(listaDomande, tutorAz.getEmail() );
  
  }
  else   if( us.equals("Tutor_universitario")) {
	dom.fillListaDomandeTUNI(listaDomande, TutorUni.getEmail() );
  }
  else   if( us.equals("dir_azienda")) {
		dom.fillDomadeTiroDAz_DB(listaDomande, DirAz.getEmail());
	  }
  else   if( us.equals("dir_dipartimento")) {
		dom.fillListaDomandeDirDip(listaDomande, dirDip.getEmail() );
	  }
     

  %>
  
    <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>
    
    
    