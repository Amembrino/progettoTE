<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Domanda Tirocinio</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
<jsp:include page="menuStudente.jsp"></jsp:include>

<div class="main">
<h2>domanda tirocinio</h2>

<form name="richiediTirocinioform" action="doDomanda.jsp" method="post">
 
  nome<input type="text"    name="nome">   <br>
  
   cognome<input type="text"  name="cognome">  <br>
   <br>email
  <input type="text"  name="Email"> 

<fieldset>  <legend>Azienda</legend>

 <select name="azienda">
        <option value ="acme">acme</option>
        <option value ="bike"> costruttori di biciclette</option>
  </select>  </fieldset>
  

    <fieldset>  <legend>tutor universitario</legend>
 <select name="tutorUni">
        <option value ="FedericaAuciello@unisa.it">Federica Auciello </option>
        <option value ="CDelizia@unisa.it">Costantino Delizia</option>
        <option value ="MicheleLB@unisa.it">Michela lala</option>
        <option value ="CDelizia@unisa.it">Costantino Delizia</option>
        
 </select>  </fieldset>
 
   <fieldset>  <legend>tutor aziendale</legend>
 <select name="tutorAzi">
        <option value = "AntonioPenna@azienda.it">antonio penna</option>
        <option value ="Calogero@azienda.it">calogero Filips</option>
           <option value ="AstolfoTontodimamma@azienda.it">astolfo toto </option>
        <option value ="GiuseppePizzetta@azienda.it"> giuseppe rossi </option>
        
 </select>  </fieldset>
 
 
 <input type="submit" value="submit">
</form>



</div>  


</body>
</html>