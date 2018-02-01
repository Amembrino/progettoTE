<%@page import="tirocinio.registro.gestore.RegistroDao"%>
 
  <jsp:useBean id="listaReg"
             class="tirocinio.registro.gestore.ListaRegistri" 
             scope="request" />
             
   <jsp:useBean id="user" 
    class="bean.User"
     scope="session"/>   
    
     <jsp:useBean id="tutorAz" 
    class="bean.TutorAz"
     scope="session"/>  
     
 
  <%
 String us= user.getTipoacc();
  
RegistroDao reg= new RegistroDao();
  
   if( us.equals("tutor_aziendale"))
	  reg.fillListaRegistri(listaReg, tutorAz.getEmail());
  

  %>
    <jsp:forward page="ConvalidaRegistriView.jsp"></jsp:forward>
    
    
    