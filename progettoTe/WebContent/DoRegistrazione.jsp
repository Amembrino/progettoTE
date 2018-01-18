<%@page import="org.omg.PortableServer.ForwardRequest"%>
<%@page import="bean.DirettoreDip"%>
<%@page import="bean.Tirocinante"%>
<%@page import="bean.tutorAz"%>
<%@page import="bean.TutorUni"%>
<%@page import="gestioneUtenza.RegistraUt"%>
 


<jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="request"/>
<jsp:useBean id="dirDip" class="bean.DirettoreDip" scope="request"/> 
<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="request"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="request"/> 
<%
 
String email=request.getParameter("email");
String nome=request.getParameter("nome");
String cognome=request.getParameter("cognome");
String password= request.getParameter("pass");
String adminemail=request.getParameter("adminemail");
 
String numUtente= request.getParameter("tipo");

int numTipoUtente= Integer.parseInt(numUtente);
 
 
RegistraUt registraUtente = new RegistraUt(email,nome,cognome,cognome,adminemail);

 
   registraUtente.insertAccount(numTipoUtente);
    

%>
