<!doctype html> 
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>compila registro</title>
 <script type="text/javascript">
function validateForm() {
    var x = document.forms["compilatirocinio"]["bags"].value;
    var y = document.forms["compilatirocinio"]["date"].value;
    var z = document.forms["compilatirocinio"]["comments"].value;
    if (x == ""||y == ""  ||z== ""  ) {
        alert("non ci possono essere campi mancanti");
        return false;
    }
}
</script>

</head>

<body>

<div class="container">
  <header>
  <!--<a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a> -->
  </header>
  
  
  <article class="content">
    <h1>Compila Registro Tirocinio</h1>
 
  <form name="compilatirocinio" action="doattività.jsp" onsubmit="return validateForm()"  method="post">
 <div class="tableRow">
		<p> Ore di attività: </p>
		<p> <input type="time" name="bags" min="1" max="10"> </p>
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
   
<!-- end .container --></div>
</body>
</html>
