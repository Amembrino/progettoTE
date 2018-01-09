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
</head>
<body>
  <div id="main">
                
                <div id="searchconsole">
                    <form id="theform" name="theform" action="DoListaDomade.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                </div>
                
    <div id="searchresult">        
     <dl>  
<% 


   for (DomandaTirocinio domanda : listaDomande.getDomande()  ) {
                    System.out.println(domanda.getId_Documento());
                 
                    String desc = domanda.getTirocinanteEmail();
                     
                    
                    out.print("<div>");
                    out.print("<h3> "+domanda.getId_Documento()+"</h3>");
                    out.print("<p class=\"descrizioned\" >"+desc+"</p>");
                
                    out.print("<p class=>il:" +domanda.getData()+"</p>");
                    
                    out.println("</div>");
                    System.out.println("domanda  "+domanda.getId_Documento() );
                   }
              
                %>
               
   </dl>
      </div>
            </div>
</body>
</html>