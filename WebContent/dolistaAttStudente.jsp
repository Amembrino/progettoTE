  
 <%@page import="bean.Registro"%>
  
 
 <%@page import="tirocinio.registro.gestore.RegistroDao"%>
  
  <jsp:useBean id="listaA" 
    class="tirocinio.registro.gestore.ListaAttivit�"
     scope="request"/>
             
 <jsp:useBean id="user" 
 class="bean.User"
  scope="session"/>

    <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
    
 <jsp:useBean id="attivit�" 
class="bean.Attivit�" 
scope="session"/>

 <jsp:useBean id="registr" 
class="bean.Registro" 
scope="session"/>

<% 

String mail=tirocinan.getEmail();
RegistroDao reg= new RegistroDao();

attivit�.setRegistroID(reg.selectId(mail));

reg.fillListaattivit�Stud(listaA, mail);
 
%>
 <jsp:forward page="ViewAttivit�Studente.jsp"></jsp:forward>