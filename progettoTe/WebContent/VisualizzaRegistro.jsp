<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
 <%@page import="gestRegTir.RegistroDAO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ListaAziende"%>
<%@page import="bean.Azienda"%>
<%@page import="Db.Connector" %>
   <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>

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
<title>Visualizza Registro</title>
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
  
  <article class="content">
    <h1>Lista attività svolte</h1>
    <section> <div id="main">
                
  <div id="searchconsole">
                    
                    
                      <div id="searchresult"> 
                    
                    <span style="font-family: Garamond; font-size: 11px; color: #000;">
                             <table width="80%" border="1" align="center" bgcolor="#79B9F4">
   
    <thead>
        <tr><th>Data</th><th>ore</th><th>Luogo</th><th>Descrizione</th></tr>
    </thead>
    
    <tbody>
  
    <% 
        
int id;
    RegistroDAO Reg= new RegistroDAO();
    id=Reg.selectId(tirocinan.getEmail());

                  
    Connection newConnection2=Connector.getConnection();
	 
	 java.sql.Statement st2  = newConnection2.createStatement();
		  String sql2 ="SELECT * FROM `attività` WHERE Registro_TirocinioID="+id+"" ;
		 ResultSet rs2 = st2.executeQuery(sql2 );
		 while(rs2.next()){
			String data=rs2.getString("Data");
			String ora=rs2.getString("Ora");
			String Luogo=rs2.getString("Luogo");
			String des=rs2.getString("Descrizione");
			 %>
			
			<div>
			   <tr>
			   <td><% out.print(" "+data+""); %></td>
			   <td><%out.print("<h3> "+ora+"</h3>"); %></td>
			   <td><% out.print("<h3> "+Luogo+"</h3>"); %></td>
			   <td><% out.print("<h3> "+des+"</h3>");%></td>
			 </tr>
			    <%
			
		 }
			rs2.close();
			 newConnection2.close();		 

	   %>
             
                </div>
                </tbody>
</table>
      </span>
                </div>
                
                 </div>
                
         </div></section>
 

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