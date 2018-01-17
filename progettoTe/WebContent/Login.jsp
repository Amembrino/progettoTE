
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN page</title>
</head>
<body>
 <h1>Login here</h1>                               
  <div>
       <form action="DoLogin.jsp" method="post">
                                       
    <input type="text" name="email" placeholder="email" pattern/>

      <input type="password"  name="pass" placeholder="password"/>
    
     <select name="tipo">
   <option value="tirocinante">Tirocinante</option>
    <option value="admin">admin</option>
    <option value="Tutor_universitario">Tutor universitario</option>
    <option value="tutor_aziendale">tutor aziendale</option>
    <option value="dir_dipartimento">Diriettore di dipartimento</option>
    <option value="dir_azienda">dirigente aziendale</option>
     </select>

     <input type="submit"  value="Login"/>
  
          </form>
</body>
</html>