<%@page import="java.sql.*" %>
<%@page import="Db.Connector" %>

<%@page import="gestRegTir.Registro"%>
<%@page import="gestRegTir.RegistroDAO"%>
 <%@ page import="java.text.*,java.util.*" session="false"%>
   <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
     <jsp:useBean id="re" class="gestRegTir.Attività" scope="session"/>
 
  <%
  
  System.out.println("ID="+re.getId());
  System.out.println("ema "+tirocinan.getEmail());
  
  int ID_Tirocinio;
	
	
  
  
 int ore=Integer.parseInt(request.getParameter("bags"));
 String data =  request.getParameter("date" );
  String com= request.getParameter("comments");
 RegistroDAO Reg= new RegistroDAO();
 int Att=Reg.ID_att();
ID_Tirocinio=Reg.selectId(tirocinan.getEmail());
  Reg.compilaRegistro(ore, data, com, ID_Tirocinio, Att);
    
  %>
  