 <%-- 
    Document   : DoLogin
    Created on : Jan 2, 2018 
    Author     : antonio
--%>

<%@page import="org.omg.PortableServer.ForwardRequest"%>
<%@page import="bean.DirettoreDip"%>
<%@page import="bean.Tirocinante"%>
<%@page import="bean.tutorAz"%>
<%@page import="bean.TutorUni"%>

<%@page import="GestAutenticazione.LoginDao"%>
<jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
<jsp:useBean id="dirDip" class="bean.DirettoreDip" scope="session"/> 
<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 
<%

String tipe=request.getParameter("tipo");
String email=request.getParameter("email");
String password= request.getParameter("pass");
   
LoginDao userdata = new LoginDao();
    Boolean loginresult= userdata.RicercaAccout(request.getParameter("email"),request.getParameter("pass"), request.getParameter("tipo"));
    
    if (loginresult == true && tipe.equals("tirocinante") ) {
    	tirocinan.setEmail(email);
    	tirocinan.setPassword(password);
 
%>
        <jsp:forward page="HomeTirocinante.jsp" />
  <%
        
    }  else if(loginresult == true && tipe.equals("Tutor_universitario") ) {
    	TutorUni.setEmail(email);
    	TutorUni.setPassword(password);
       
%>
 <jsp:forward page="HomeTurorUni.jsp" />
       <%
    }  else  if(loginresult == true && tipe.equals("dir_dipartimento") ) {
    	dirDip.setEmail(email);
    	dirDip.setPassword(password);
      
%>  
 <jsp:forward page="Homedir_dipartimento.jsp" />
 
 <%
    }  else  if(loginresult == true && tipe.equals("tutor_aziendale") ) {
    	tutorAz.setEmail(email);
    	tutorAz.setPassword(password);
      
%>  
 <jsp:forward page="HomeTutorAz.jsp" />
       <%
       
    } 
    else{
    System.out.println( email.toString()+"...non trovato");
      }
   
%>
 
<jsp:forward page="Login.jsp" />

