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
<!--<link rel="stylesheet" type="text/css" href="style.css"> e --> 

<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]--></head>

<body>

  

<!--<div class="container">
  <header>
<!--    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a> -->
  </header>
  </div>
<!--<jsp:include page="menuStudente.jsp"></jsp:include>e --> 
  
 <!-- <article class="content">
    <h1>Consulta aziende</h1>
     
  <!--  <jsp:include page="HomeTirocinante.jsp"></jsp:include>e 
    
     <div id="main">
                --> 
  
                <div id="searchconsole">
                    <form id="theform" name="theform" action="DoListaAziende.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                      <div id="searchresult"> 
                    
                    <% 
                  
   for (Azienda x : lista.getAzienda()) {


                    
                    out.print("<div>");
                    out.print("<h3> "+x.getId_Azienda()+"</h3>");
                    out.print("<h3> "+x.getNome()+"</h3>");
                    out.print("<h3> "+x.getSede_Operativa()+"</h3>");
                    out.print("<h3> "+x.getSede_Amministrativa()+"</h3>");
                    out.print("<h3> "+x.getDir_AziendaEmail()+"</h3>");
                    out.print("<h3> "+x.getTutor_AziendaEmail()+"</h3>");
                    
                
System.out.println(x.getNome().toString());
                    
                    
                    out.println("</div>");
                 
                   }
              
                %>
      
     <!--             </div>
                 </div>
                
         </div>
    <section></section>
    <section> </section>
    
  <!-- end .content --></article>
  <article class="content">
    
    <section></section>
    <section> </section>
    
  <!-- end .content --></article>
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
<!-- end .container --></div>
</body>
</html>
