 
 
<%@page import="bean.Attivit�"%>
<%@page import="bean.Registro"%> 
<%@page import="bean.TutorAz"%>
<%@page import="bean.TutorUni"%>
 

 <jsp:useBean id="listaA" 
    class="tirocinio.registro.gestore.ListaAttivit�"
     scope="request"/>
             
 <jsp:useBean id="user" 
 class="bean.User" 
 scope="session"/>

<jsp:useBean id="tutorAz"
 class="bean.TutorAz" 
 scope="session"/>
 
 <jsp:useBean id="registr" 
class="bean.Registro" 
scope="session"/>
 
  <jsp:useBean id="attivit�" 
class="bean.Attivit�" 
scope="session"/>
 
  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>attivit�</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="table.css">
 

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
     <tr>    <th>     ID_attivit�   </th> <th>   ore attivit�   </th> <th>   date  </th> <th>     descrizione      </th>  </tr>
     
     </thead>
     <tbody>
<% 
     

     
 
      for (Attivit� att : listaA.getAttivit�() ) {
            out.print("<tr>");
                     
                    out.print("<td><p>"+ att.getId()+"</p></td>");
                    out.print("<td><p>"+ att.getOra()+"</p></td>");
                    out.print("<td><p>"+ att.getData()+"</p></td>");
                    out.print("<td><p>" +att.getDescrizione()+"</p></td>");
                    
       
   int x= att.getRegistroID();   
 
                
   out.print("</tr>");   
   
                                      
   }  
//out.print("<a  class=\"demo\" href=\"Doconvalida.jsp?id="+x+"\">convalida attivit� del registro "+att.getRegistroID() +"</a>");  

       
%>   </tbody>  
         </table>
         
         <form action="Doconvalida.jsp">
       <b>convalida registro con id </b> 
         <input type="submit"  name="id" value= "<%out.print(attivit�.getRegistroID());%>">
         </form>
      </div>
   </div>
</body>
</html>