<!doctype html> 
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>compila registro</title>
</head>

<body>

<div class="container">
  <header>
  <!--<a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a> -->
  </header>
  
  
  <article class="content">
    <h1>Compila Registro Tirocinio</h1>
 
  <form name="compilatirocinio" action="doattività.jsp" method="post">
 <div class="tableRow">
		<p> Ore di attività: </p>
		<p> <input type="number" name="bags" min="1" max="10"> </p>
	</div>
	<div class="tableRow label">
		<p> Data: </p>
		<p> <input type="date" name="date"> </p>
	</div>

	<div class="tableRow">
		<p> Attività: </p>
		<p>
            <textarea name="comments"></textarea>
		</p>
	</div>
	<div class="tableRow">
		<p></p>
		<p> <input type="submit" value="Compila"> </p>
	</div>
</form>





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
