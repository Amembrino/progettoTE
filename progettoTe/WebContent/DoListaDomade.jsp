<%@page import="bean.tutorAz"%>
<%@page import="bean.user"%>
<%@page import="bean.TutorUni"%>
<%@page import="bean.DirigenteAzienda"%>
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
    
    <jsp:useBean id="DirAz" 
    class="bean.DirigenteAzienda" 
    scope="session"/> 
    
    
     <!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style.css">


</head>

<body>

<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a>
  </header>
  <div class="sidebar1">
    
    <aside>
      <p> Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.</p>
      <p>Scrivo qualcosa tanto per</p>
    </aside>
  <!-- end .sidebar1 --></div>
  
  <article class="content">
    <h1>Login here</h1>                               
  <div>
    
    
    
  <%
 String us= user.getTipoacc();
  
  out.print(DirAz.getEmail());
  
   DomaTirociDAO dom= new  DomaTirociDAO();
  
   if( us.equals("tutor_aziendale")){
	  
  dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail() );
  
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
  </div>
  
    <!-- end .content </article>
  <aside>
    <h4>Lorem</h4>
    <p> Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.  </p>
  </aside>
  <footer>
    <p> Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. </p>
    <address>
      TirocinioEasy
    </address>
  </footer>
<!-- end .container --></div>
</body>
</html>
  
    <jsp:forward page="ViewDomadetirocinio.jsp"></jsp:forward>
    
    
    