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


 </article>
 </div>
</body>
</html>
