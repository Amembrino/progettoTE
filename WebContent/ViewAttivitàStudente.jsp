 
 
<%@page import="bean.Attivit�"%>
<%@page import="bean.Registro"%> 
<%@page import="bean.TutorAz"%>
<%@page import="bean.TutorUni"%>
 

 <jsp:useBean id="listaA" 
    class="tirocinio.registro.gestore.ListaAttivit�"
     scope="request"/>
             
 
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
<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/pkhmzDx.png" width="864" height="187" alt=""/></a>
  </header>
   <jsp:include page="menuStudente.jsp"></jsp:include>

	
  <div class="main">
                
                <div id="searchconsole">
                  <!--    <form id="theform" name="theform" action="DoListaAziende.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                      <div id="searchresult"> -->
                    
                    <span style="font-family: Garamond; font-size: 14px; color: #000;">
                             <table width="10%" border="1" align="center" bgcolor="#79B9F4">
   
    <thead>
        <tr>    <th>     ID_attivit�   </th> <th>   data   </th> <th>   ore attivit�  </th> <th>     descrizione      </th>  </tr>
    </thead>
    
    <tbody>
  
    <% 
                   
   for (Attivit� att : listaA.getAttivit�() ) {

	   %><div>
	   <tr>
	   <td><%out.print(" "+att.getId()+""); %></td>
	   <td><%out.print("<h3> "+att.getData()+"</h3>"); %></td>
	   <td><% out.print("<h3> "+att.getOra()+"</h3>"); %></td>
	   <td><% out.print("<h3> "+att.getDescrizione()+"</h3>");%></td>
	 </tr>
	    <%} %>
             
                </div>
                </tbody>
</table>
      </span>
                </div>
                
                 </div>
                
         </div>
         </section>
 


</body>
</html>
              
