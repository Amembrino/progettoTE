 
 
<%@page import="bean.Attivity"%>
<%@page import="bean.Registro"%> 
<%@page import="bean.TutorAz"%>
<%@page import="bean.TutorUni"%>
 

 <jsp:useBean id="listaA" 
    class="tirocinio.registro.gestore.ListaAttività"
     scope="request"/>
             
 <jsp:useBean id="user" 
 class="bean.User" 
 scope="session"/>

<jsp:useBean id="tutorAz"
 class="bean.TutorAz" 
 scope="session"/>
  
 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>attività</title>
<link rel="stylesheet" type="text/css" href="style.css">

<style>
table {
    border-collapse: collapse;
    border-spacing: 0;
    width: 50%;
    border: 1px solid #ddd;
}

th, td {
    text-align: left;
    padding: 1px;
}
 
tr:nth-child(even) {
    background-color: #f2f2f2
}
</style>

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
     <tr>    <th>ID_attività</th> <th> ore attività</th> <th>date</th> <th>descrizione </th>   </tr>
     
     </thead>
     <tbody>
<% 
     

     

      for (Attivity att : listaA.getAttività() ) {
            out.print("<tr>");
                     
                    out.print("<td><p>"+ att.getId()+"</p></td>");
                    out.print("<td><p>"+ att.getOra()+"</p></td>");
                    out.print("<td><p>"+ att.getData()+"</p></td>");
                    out.print("<td><p class=/"id/">" +att.getDescrizione()+"</p></td>");
                 //   out.print("<td><p>"+att.getRegistroID() +"</p></td>");
                
                          int x= att.getRegistroID();           
                  
                          out.print("</tr>");  
                                      
   }     
out.print("<a href=\"Doconvalida.jsp?id="+x+"\">convalida attività del registro "+att.getRegistroID() +"</a>");  

       
%> 
 <tr>
 <script>
var x = document.getElementsByClassName("id");
document.getElementById("demo").innerHTML = 
'The first paragraph (index 0) with class="intro": ' + x[0].innerHTML;
</script>
 
 
 </tr>
</tbody>  
             
              
   </table>
   
     </div>
            </div>
</body>
</html>