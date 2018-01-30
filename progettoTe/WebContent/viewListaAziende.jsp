<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ListaAziende"%>
<%@page import="bean.Azienda"%>


<jsp:useBean id="lista"
             class="bean.ListaAziende"
             scope="request" />
             
             <jsp:useBean id="azienda"
             class="bean.Azienda"
             scope="request" />

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Lista Aziende</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<style>
table  { 
    border-collapse:collapse
}
td, th { 
    border:1px solid #000;
    padding:2px;
}
</style>
<body>

  

<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a> 
  </header>
  <jsp:include page="menuStudente.jsp"></jsp:include>
   
    <h1>Lista aziende</h1>
    <section> <div id="main">
                
  <div id="searchconsole">
                    <form id="theform" name="theform" action="DoListaAziende.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                      <div id="searchresult"> 
                    
                    <span style="font-family: Garamond; font-size: 11px; color: #000;">
                             <table width="80%" border="1" align="center" bgcolor="#79B9F4">
   
    <thead>
        <tr><th>Nome</th><th>Sede Operativa</th><th>Sede Amministrativa</th><th>Email Direttore</th><th>Email Tutor</th></tr>
    </thead>
    
    <tbody>
  
    <% 
                   
   for (Azienda x : lista.getAzienda()) {

	   %><div>
	   <tr>
	   <td><%out.print(" "+x.getNome()+""); %></td>
	   <td><%out.print("<h3> "+x.getSede_Operativa()+"</h3>"); %></td>
	   <td><% out.print("<h3> "+x.getSede_Amministrativa()+"</h3>"); %></td>
	   <td><% out.print("<h3> "+x.getDir_AziendaEmail()+"</h3>");%></td>
	   <td><% out.print("<h3> "+x.getTutor_AziendaEmail()+"</h3>"); %></td>
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
 

  <!-- end .content </article>
  <aside>
    <h4>Sfondi</h4>
    <p>Normalmente, il colore di sfondo di un elemento di blocco viene visualizzato solo per tutta la lunghezza del contenuto. Se desiderate visualizzare una linea di divisione anziché un colore, inserite un bordo sul lato del blocco .content  (ma solo se esso conterrà sempre una quantità maggiore di contenuto).</p>
  </aside>
  <footer>
    <p>Ciao a tutti</p>
    <address>
      Contenuto indirizzo
    </address>
  </footer>
<!-- end .container </div>-->
</body>
</html>
