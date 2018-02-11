  
 <%@page import="bean.Registro"%>
  
 
 <%@page import="tirocinio.registro.gestore.RegistroDao"%>
  
  <jsp:useBean id="listaA" 
    class="tirocinio.registro.gestore.ListaAttività"
     scope="request"/>
             
 <jsp:useBean id="user" 
 class="bean.User"
  scope="session"/>

    <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
    
 <jsp:useBean id="attività" 
class="bean.Attività" 
scope="session"/>

 <jsp:useBean id="registr" 
class="bean.Registro" 
scope="session"/>

<% 

String mail=tirocinan.getEmail();
RegistroDao reg= new RegistroDao();

attività.setRegistroID(reg.selectId(mail));

reg.fillListaattivitàStud(listaA, mail);
 
%>
 <jsp:forward page="ViewAttivitàStudente.jsp"></jsp:forward>