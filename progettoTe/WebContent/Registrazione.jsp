<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registra Utente</title>
</head>
<body>

<div>

       <form action="DoRegistrazione.jsp" method="post">
       
        <select name="tipo">
    <option value="1">dirigente aziendale</option>
   <option value="2">Diriettore di dipartimento</option>
   <option value="3">Tirocinante</option>
   <option value="4">tutor aziendale</option>
   <option value="5">Tutor universitario</option>
   
    </select>
                                       
    <input type="text" name="email" placeholder="email"/>
    
    <input type="text" name="nome" placeholder="nome"/>
    
    <input type="text" name="cognome" placeholder="cognome"/>

      <input type="password"  name="password" placeholder="password"/>
      
      <input type="text" name="adminemail" placeholder="adminemail"/>
      

     <input type="submit"  value="Registrazione"/>
  
          </form>

</body>
</html>