<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ListaAziende"%>
<%@page import="bean.Azienda"%>


<jsp:useBean id="lista"
             class="bean.ListaAziende"
             scope="session" />

               

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Aziende</title>
</head>
<body>
  <div id="main">
                
                <div id="searchconsole">
                    <form id="theform" name="theform" action="DodoListaAziende.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                </div>
                
    <div id="searchresult">        
     <dl>  
<% 


   for (Azienda x : lista.getAzienda()) {
                     
                    
                    out.print("<div>");
                    out.print("<h3> "+x.getId_Azienda()+"</h3>");
                    out.print("<h3> "+x.getNome()+"</h3>");
                    out.print("<h3> "+x.getSede_Operativa()+"</h3>");
                    out.print("<h3> "+x.getSede_Amministrativa()+"</h3>");
                    out.print("<h3> "+x.getDir_AziendaEmail()+"</h3>");
                    out.print("<h3> "+x.getTutor_AziendaEmail()+"</h3>");
                    
                
                    
                    
                    out.println("</div>");
                 
                   }
              
                %>
               
   </dl>
      </div>
            </div>
</body>
</html>