 <jsp:useBean id="user" class="bean.user" scope="session"/>
<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TirocinioEasy Home</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a>
  </header>
  
  <% if (user.getTipoacc().equals("Tutor_universitario")){%>
  								<jsp:include page="menuTutorUni.jsp"></jsp:include>
  								<article class="content">
    <h1>HomepageTirocinante</h1>
    
    <jsp:include page="HomeTurorUni.jsp"></jsp:include>
  <%}
  if (user.getTipoacc().equals("tutor_aziendale")){%>
  								<jsp:include page="menuTutorAz.jsp"></jsp:include>
  								<article class="content">
    <h1>HomeTutorAziendale</h1>
    
    <jsp:include page="HomeTutorAz.jsp"></jsp:include>
  <%}
  if (user.getTipoacc().equals("dir_azienda")){%>
  								<jsp:include page="menuDirAz.jsp"></jsp:include>
  								<article class="content">
    <h1>Home Direttore Azienda</h1>
    
    <jsp:include page="HomeDirAz.jsp"></jsp:include>
  <%}
  if (user.getTipoacc().equals("dir_dipartimento")){%>
								<jsp:include page="Homedir_dipartimento.jsp"></jsp:include>
								<article class="content">
    <h1>Homedir_dipartimento</h1>
    
    <jsp:include page="Homedir_dipartimento.jsp"></jsp:include>
<%}
  if (user.getTipoacc().equals("tirocinante")){%> 
								<jsp:include page="menuStudente.jsp"></jsp:include>
								<article class="content">
    <h1>HomepageStudente</h1>
    
    <jsp:include page="HomeTirocinante.jsp"></jsp:include>
    <%} %>
  
            
    <div id="searchresult">        
     <dl>  </div>
    <section></section>
    <section> </section>
    
  <!-- end .content --></article>
  <article class="content">
    
    <section></section>
    <section> </section>
    
  <!-- end .content --></article>
  <aside>
    <h4>Sfondi</h4>
    <p>Normalmente, il colore di sfondo di un elemento di blocco viene visualizzato solo per tutta la lunghezza del contenuto. Se desiderate visualizzare una linea di divisione anziché un colore, inserite un bordo sul lato del blocco .content  (ma solo se esso conterrà sempre una quantità maggiore di contenuto).</p>
  </aside>
  <footer>
    <p>Ciao a tutti</p>
    <address>
      Contenuto indirizzo
    </address>
  </footer>
<!-- end .container --></div>
</body>
</html>
