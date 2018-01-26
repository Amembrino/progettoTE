<%@ page language="java" import="java.sql.*" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Registrazione</title>
</head>

<body>

<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a> 
  </header>
  <jsp:include page="menuAdmin.jsp"></jsp:include>
  
  <article class="content">
    <h1>Registrazione</h1>
    <section></section>
    <section></section>
    <section>
      <h2>&nbsp;</h2>
    </section>




     <form action="DoRegistrazione.jsp" method="post">
       
        <select name="tipo">
    <option value="1">dirigente aziendale</option>
   <option value="2">Diriettore di dipartimento</option>
   <option value="3">Tirocinante</option>
   <option value="4">tutor aziendale</option>
   <option value="5">Tutor universitario</option>
   
    </select>
                                       
    <input type="email" name="email" placeholder="email"/>
    
    <input type="text" name="nome" placeholder="nome"/>
    
    <input type="text" name="cognome" placeholder="cognome"/>

      <input type="password"  name="password" placeholder="password"/>
      
      

     <input type="submit"  value="Registrazione"/>
  
          </form>



  <!-- end .content --></article>
  <aside>
    <h4>Sfondi</h4>
    <p>Normalmente, il colore di sfondo di un elemento di blocco viene visualizzato solo per tutta la lunghezza del contenuto. Se desiderate visualizzare una linea di divisione anzich� un colore, inserite un bordo sul lato del blocco .content  (ma solo se esso conterr� sempre una quantit� maggiore di contenuto).</p>
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
