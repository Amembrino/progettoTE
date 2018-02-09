 

<%@page import="bean.TutorAz"%>
<%@page import="bean.TutorUni"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%> 
<%@page import="bean.ListDomandeTiro"%>
<%@page import="bean.DomandaTirocinio"%>

<jsp:useBean id="listaDomande"
             class="bean.ListDomandeTiro"
             scope="request" />
             
 <jsp:useBean id="user" class="bean.User" scope="session"/>
<jsp:useBean id="tutorAz" class="bean.TutorAz" scope="session"/>
<jsp:useBean id="TutorUni" class="bean.TutorUni" scope="session"/> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>domande tirocinio</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="table.css">


</head>
<body>
<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a> 
  </header>
  
<% if (user.getTipoacc().equals("Tutor_universitario")){
	
	%><jsp:include page="menuTutorUni.jsp"></jsp:include>
<% }if (user.getTipoacc().equals("tutor_aziendale")){
	
	%><jsp:include page="menuTutorAz.jsp"></jsp:include>
	<%} if (user.getTipoacc().equals("dir_azienda")){
	
	%><jsp:include page="menuDirAz.jsp"></jsp:include>
	<% }if (user.getTipoacc().equals("dir_dipartimento")){
		
		%><jsp:include page="menudir_dipartimento.jsp"></jsp:include>
		<% } %>
	
	
	
	<article class="content">
    <h1>Lista Domande</h1>
    <section> <div id="main">
                
  <div id="searchconsole">
                    <form id="theform" name="theform" action="DoListaDomade.jsp" method="POST">
                         
                        <span><input type="submit" value="cerca"></span>
                    </form>
                    
                </div>
                
    <div id="searchresult">        
     <table>  
     <thead>
     <tr>    <th> email tirocinante</th> <th> data domanda</th> <th>id domanda</th> <th>attivazione</th>   </tr>
     
     </thead>
     <tbody>
<% 
     


   for (DomandaTirocinio domanda : listaDomande.getDomande()  ) {
                    
                 
                    String tirocinante = domanda.getTirocinanteEmail();
                     
                     out.print("<tr>");
                     
                    out.print("<td><p>"+tirocinante+"</p></td>");
                    out.print("<td><p> richiesta il:" +domanda.getData()+"</p></td>");
                    out.print("<td><p> id n:" +domanda.getId_Documento()+"</p></td>");
                 if (user.getTipoacc().equals("tutor_aziendale")){
                    out.print("<td> <a href=\"DofirmaTutorAz.jsp?iddomanda="+domanda.getId_Documento()+"\">firma taz</a> </td>");
                 }else if (user.getTipoacc().equals("Tutor_universitario")){
                	 out.print("<td> <a href=\"DofirmaTutorUni.jsp?iddomanda="+domanda.getId_Documento()+"\">firma tuni</a> </td>");

                 }
                 else if (user.getTipoacc().equals("dir_dipartimento")){
                	 out.print("<td> <a href=\"DofirmaDirDip.jsp?iddomanda="+domanda.getId_Documento()+"\">firma dir dip</a> </td>");
                 }else if (user.getTipoacc().equals("dir_azienda")){
                	 out.print("<td> <a href=\"DofirmaDirAz.jsp?iddomanda="+domanda.getId_Documento()+"\">firma dir az</a> </td>");

                 }
                  //  lista delle domande da firmare per ogni tipo di accaunt;
                    out.print("</tr>");                
   }     
                %>
                
                 
                </tbody>
                
                
                
                
   </table>
               </div>
                
                
                
         </div></section>
 

  <!-- end .content  </article>
  <aside>
    <h4>Sfondi</h4>
    <p>Normalmente, il colore di sfondo di un elemento di blocco viene visualizzato solo per tutta la lunghezza del contenuto. Se desiderate visualizzare una linea di divisione anziché un colore, inserite un bordo sul lato del blocco .content  (ma solo se esso conterrà sempre una quantità maggiore di contenuto).</p>
  </aside>-->
  <footer>
    
    <p>le domande firmate non vengono pi&ugrave;  visualizzate</p>
     
  </footer>
<!-- end .container --></div>
</body>