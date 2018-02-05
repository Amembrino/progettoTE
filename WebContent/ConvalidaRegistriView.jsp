  
<%@page import="bean.Attività"%> 
<%@page import="bean.Registro"%> 
<%@page import="bean.TutorAz"%>
 
 

<jsp:useBean id="listaReg"
             class="tirocinio.registro.gestore.ListaRegistri"
             scope="request" />
             
 <jsp:useBean id="user" class="bean.User" scope="session"/>
<jsp:useBean id="tutorAz" class="bean.TutorAz" scope="session"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 

 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> registri</title>
<link rel="stylesheet" type="text/css" href="style.css">

 

</head>
<body>

<% if (user.getTipoacc().equals("Tutor_universitario")){
	
	%><jsp:include page="menuTutorUni.jsp"></jsp:include>
<% }if (user.getTipoacc().equals("tutor_aziendale")){
	
	%><jsp:include page="menuTutorAz.jsp"></jsp:include>
	<%} %>
	
  <div class="main">
                
               <!--  <div id="searchconsole">
                    <form id="theform" name="theform" action="DolistaRegistri.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>  
                    
                </div>-->
              
    <div id="searchresult">        
     <table>  
     <thead>
     <tr>    <th>ID_Tirocinio</th> <th> convalida</th> <th>mail tirocinante</th>  </tr>
     
     </thead>
     <tbody>
<% 
     


      for (Registro reg : listaReg.getRegistri() ) {
            out.print("<tr>");
                     
                    out.print("<td><p>"+ reg.getId()+"</p></td>");
                    out.print("<td><p>" +reg.getConv()+"</p></td>");
                    out.print("<td><a href=\"DolistaAttività.jsp?mail="+reg.getTir_em()+"\">visuliazza attività di  " +reg.getTir_em()+"</a></td>");
              
                    out.print("</tr>");          
                    // if (user.getTipoacc().equals("tutor_aziendale")){// completa con Doconvalida
                    //   out.print("<tr><td> <a href=\"Doconvalida.jsp?iddomanda="+reg.getId() +"\">convalida registro</a> </td></tr>");
                    //}
   }     
                %>
                </tbody>
   </table>
      </div>
            </div>
</body>
</html>