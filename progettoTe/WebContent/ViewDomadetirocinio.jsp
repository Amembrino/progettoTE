<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ListDomandeTiro"%>
<%@page import="bean.DomandaTirocinio"%>

<jsp:useBean id="listaDomande"
             class="bean.ListDomandeTiro"
             scope="request" />
             
 <jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
               

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
                    out.print("<td> <a href=\"DofirmaTutorAz.jsp?iddomanda="+domanda.getId_Documento()+"\">firma</a> </td>");
                     
                  //  System.out.println("domanda  "+domanda.getId_Documento() );
                    out.print("</tr>");                
   }
              
                %>
                </tbody>
   </table>
      </div>
            </div>
</body>
</html>