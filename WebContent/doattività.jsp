 

<%@page import="tirocinio.registro.gestore.Registro"%>
<%@page import="tirocinio.registro.gestore.RegistroDao"%>
 
   <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
     <jsp:useBean id="re" class="tirocinio.registro.gestore.Attivit�" scope="session"/>
 
  <%
  
  System.out.println("ID="+re.getId());
  System.out.println("ema "+tirocinan.getEmail());
  
  int ID_Tirocinio;
	
	
  
  
 int ore=Integer.parseInt(request.getParameter("bags"));
 String data =  request.getParameter("date" );
  String com= request.getParameter("comments");
 RegistroDao Reg= new RegistroDao();
 int Att=Reg.ID_att();
ID_Tirocinio=Reg.selectId(tirocinan.getEmail());
  Reg.compilaRegistro(ore, data, com, ID_Tirocinio, Att);
    
  %>
  