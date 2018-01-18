<%@page import="bean.tutorAz"%>
<%@page import="bean.user"%>
<%@page import="bean.TutorUni"%>
<%@page import="GestDomTirocino.DomaTirociDAO"%>

  <jsp:useBean id="listaDomande" 
    class="bean.ListDomandeTiro"
     scope="request"/>
     
 <jsp:useBean id="user" 
    class="bean.user"
     scope="session"/>   
    
     <jsp:useBean id="tutorAz" 
    class="bean.tutorAz"
     scope="session"/>  
     
      <jsp:useBean id="TutorUni" 
    class="bean.TutorUni"
     scope="session"/>   
     
    <jsp:useBean id="dirDip" 
    class="bean.DirettoreDip" 
    scope="session"/> 
  <%
 String us= user.getTipoacc();
  
   DomaTirociDAO dom= new  DomaTirociDAO();
  
   if( us.equals("tutor_aziendale")){
	  
  dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail() );
  
  }
  else   if( us.equals("Tutor_universitario")) {
	dom.fillListaDomandeTUNI(listaDomande, TutorUni.getEmail() );
  }
  else   if( us.equals("dir_dipartimento")) {
		dom.fillListaDomandeDirDip(listaDomande, dirDip.getEmail() );
	  }
   System.out.println(user.getTipoacc());     
    

  %>
    <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>
    
    
    