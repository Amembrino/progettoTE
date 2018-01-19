<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>

<%@page import="bean.tutorAz"%>
<%@page import="bean.TutorUni"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ListDomandeTiro"%>
<%@page import="bean.DomandaTirocinio"%>

<jsp:useBean id="listaDomande"
             class="bean.ListDomandeTiro"
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
    width: 100%;
    border: 1px solid #ddd;
}

th, td {
    text-align: left;
    padding: 16px;
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
                    <form id="theform" name="theform" action="DoListaDomade.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                </div>
                
    <div id="searchresult">        
     <table>  
     <thead>
     <tr>    <th> email tirocinante</th> <th> data domanda</th> <td>id domanda</th> <th>attivazione</th>   </tr>
     
     </thead>
     <tbody>
<% 
     


   for (DomandaTirocinio domanda : listaDomande.getDomande()  ) {
                    
                 
                    String tirocinante = domanda.getTirocinanteEmail();
                     
                     out.print("<tr>");
                     
                    out.print("<td><p class=\"descrizioned\" >"+tirocinante+"</p></td>");
                    out.print("<td><p class=> richiesta il:" +domanda.getData()+"</p></td>");
                    out.print("<td><p class=>id n:" +domanda.getId_Documento()+"</p></td>");
                 if (user.getTipoacc().equals("tutor_aziendale")){
                    out.print("<td> <a href=\"DofirmaTutorAz.jsp?iddomanda="+domanda.getId_Documento()+"\">firma taz</a> </td>");
                 }else if (user.getTipoacc().equals("Tutor_universitario")){
                	 out.print("<td> <a href=\"DofirmaTutorUni.jsp?iddomanda="+domanda.getId_Documento()+"\">firma tuni</a> </td>");
                 }
                 else if (user.getTipoacc().equals("dir_dipartimento")){
                	 out.print("<td> <a href=\"DofirmaDirDip.jsp?iddomanda="+domanda.getId_Documento()+"\">firma dir dip</a> </td>");
                 }
                  //  lista delle domande da firmare per ogni tipo di accaunt;
                    out.print("</tr>");                
   }     
                %>
                </tbody>
   </table>
      </div>
            </div>
</body>
</html>