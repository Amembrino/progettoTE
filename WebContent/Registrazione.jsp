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
    <a href="#"><img src="https://i.imgur.com/pkhmzDx.png" width="864" height="187" alt=""/></a> 
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
                                       
    <input type="email" name="email" placeholder="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{5,3}" required="required" />
    
    <input type="text" name="nome" placeholder="nome"  required="required"/>
    
    <input type="text" name="cognome" placeholder="cognome" required="required"/>

      <input type="password"  name="password" placeholder="password"  pattern="^[a-zA-Z0-9!é°à]{6,20}$"  title="password tra 6 e 20 caratteri alfanumerici "   />
      
      <script type="text/javascript">
      if(pattern)
      </script>

     <input type="submit"  value="Registrazione"/>
  
          </form>


 </article>
 </div>
</body>
</html>
