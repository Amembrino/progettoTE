 
<%@page import="bean.tutorAz"%>
<%@page import="bean.TutorUni"%>
 <%@page import="gestRegTir.Registro"%>

<jsp:useBean id="listaReg"
             class="gestRegTir.ListaRegistri"
             scope="request" />
             
 <jsp:useBean id="user" class="bean.user" scope="session"/>
<jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>domande tirocinio</title>
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
                
                <div id="searchconsole">
                    <form id="theform" name="theform" action="DolistaRegistri.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                </div>
                
    <div id="searchresult">        
     <table>  
     <thead>
     <tr>    <th>ID_Tirocinio</th> <th> convalida</th> <th>mail tirocinante</th> <th>tutor aziendale </th>   </tr>
     
     </thead>
     <tbody>
<% 
     


      for (Registro reg : listaReg.getRegistri() ) {
            out.print("<tr>");
                     
                    out.print("<td><p class=\"descrizioned\" >"+ reg.getId()+"</p></td>");
                    out.print("<td><p class=> richiesta il:" +reg.getConv()+"</p></td>");
                    out.print("<td><p class=>id n:" +reg.getTir_em()+"</p></td>");
                 if (user.getTipoacc().equals("tutor_aziendale")){// completa con Doconvalida
                    out.print("<td> <a href=\"Doconvalida.jsp?iddomanda="+reg.getId() +"\">convalida registro</a> </td>");
                 }
                    out.print("</tr>");                
   }     
                %>
                </tbody>
   </table>
      </div>
            </div>
</body>
</html>