<%@page import="tirocinio.registro.gestore.RegistroDAO"%>
 
  <jsp:useBean id="listaReg"
             class="tirocinio.registro.gestore.ListaRegistri" 
             scope="request" />
             
   <jsp:useBean id="user" 
    class="bean.user"
     scope="session"/>   
    
     <jsp:useBean id="tutorAz" 
    class="bean.tutorAz"
     scope="session"/>  
     
 
  <%
 String us= user.getTipoacc();
  
RegistroDAO reg= new RegistroDAO();
  
   if( us.equals("tutor_aziendale"))
	  reg.fillListaRegistri(listaReg, tutorAz.getEmail());
  

  %>
    <jsp:forward page="ConvalidaRegistriView.jsp"></jsp:forward>
    
    
    