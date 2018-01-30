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
<%@page import="bean.DirigenteAzienda" %>
<%@page import="bean.Amministratore" %> 
<%@page import="bean.user"%>
<%@page import="gestAutenticazione.LoginDao"%>
<jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
<jsp:useBean id="dirDip" class="bean.DirettoreDip" scope="session"/> 
<jsp:useBean id="user" class="bean.user" scope="session"/>
<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 
<jsp:useBean id="amministratore" class="bean.Amministratore" scope="session"/> 
<jsp:useBean id="DirAz" class="bean.DirigenteAzienda" scope="session"/> 
<%

String tipe=request.getParameter("tipo");
String email=request.getParameter("email");
String password= request.getParameter("pass");
   
LoginDao userdata = new LoginDao();
    Boolean loginresult= userdata.ricercaAccout(email, password, tipe  );
    
    if (loginresult == true && tipe.equals("tirocinante") ) {
    	tirocinan.setEmail(email);
    	tirocinan.setPassword(password);
    	user.setTipoacc("tirocinante");
 
%>
        <jsp:forward page="Homepage.jsp" />
  <%
        
    }  else if(loginresult == true && tipe.equals("Tutor_universitario") ) {
    	TutorUni.setEmail(email);
    	TutorUni.setPassword(password);
    	user.setTipoacc("Tutor_universitario");
       
    	%>
 <jsp:forward page="Homepage.jsp" />
 
 <%
        
    }  else if(loginresult == true && tipe.equals("dir_azienda") ) {
    	DirAz.setEmail(email);
    	DirAz.setPassword(password);
    	user.setTipoacc("dir_azienda");
       
    	%>
 <jsp:forward page="Homepage.jsp" />
 
 
       <%
    }  else  if(loginresult == true && tipe.equals("dir_dipartimento") ) {
    	dirDip.setEmail(email);
    	dirDip.setPassword(password);
    	user.setTipoacc("dir_dipartimento");
%>  
 <jsp:forward page="Homepage.jsp" />
 
 <%
    }  else  if(loginresult == true && tipe.equals("tutor_aziendale") ) {
    	tutorAz.setEmail(email);
    	tutorAz.setPassword(password);
    	user.setTipoacc("tutor_aziendale");
    	
%>  
 <jsp:forward page="Homepage.jsp" />
 
 <%
    }  else  if(loginresult == true && tipe.equals("amministratore") ) {
    	amministratore.setEmail(email);
    	amministratore.setPassword(password);
    	user.setTipoacc("amministratore");
    	
%>  
 <jsp:forward page="Homepage.jsp" />
 
       <%
       
    } 
    else{%>
      
    <script language="javascript">
    alert("non trovato ");	//Java Script alert message
    </script>
    <%
    out.print( email.toString()+"...non trovato");
      }
   
    %>
    
    
    <jsp:forward page="Login.jsp" />

