<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style.css">


</head>

<body>

<div class="container">
  <header>
    <a href="#"><img src="https://i.imgur.com/hQ9S6Em.png" width="864" height="187" alt=""/></a>
  </header>
  <div class="sidebar1">
    
     <p>progetto ingegneria del software anno 2017/2018 <br> angrisani, campetiello, membrino, salatiello</p>
   
   </div>
  
  
    <h1>Login here</h1>                               
   
       <form action="DoLogin.jsp" method="post">
                                       
    <input type="text" name="email" placeholder="email">

      <input type="password"  name="pass" placeholder="password" pattern="[a-zA-Z0-9!é°à]{6,20}$" title="password tra 6 e 20 caratteri"/>
    
     <select name="tipo">
    <option value="tirocinante">Tirocinante</option>
    <option value="amministratore">admin</option>
    <option value="Tutor_universitario">Tutor universitario</option>
    <option value="tutor_aziendale">tutor aziendale</option>
    <option value="dir_dipartimento">Diriettore di dipartimento</option>
    <option value="dir_azienda">dirigente aziendale</option>
     </select>

     <input type="submit"  value="Login"/>
  
          </form>
    
  <!-- end .content </article>
  <aside>
    <h4>Lorem</h4>
    <p> Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.  </p>
  </aside>
  <footer>
    <p> Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. </p>
    <address> 
       
    </address>
  </footer>
 end .containe </div>-->
</body>
</html>
