 <%@page import="java.sql.*" %>
<%@page import="db.Connector" %>

<%@page import="tirocinio.registro.gestore.Registro"%>
<%@page import="tirocinio.registro.gestore.RegistroDAO"%>
<%@page import="tirocinio.registro.gestore.Attività"%>

    <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
  
<%
  
int ID_Tirocinio;
int Att;	
 
int ore=Integer.parseInt(request.getParameter("ore"));
String data =  request.getParameter("date" );
String com= request.getParameter("comments");
RegistroDAO Reg= new RegistroDAO();
 
Att=Reg.ID_att();

Att++;

ID_Tirocinio=Reg.selectId(tirocinan.getEmail());
 if (ID_Tirocinio==0){
	 
	 %>
	   <jsp:forward page="registrononfatto.jsp" />
	   <%  
 }
Reg.compilaRegistro(ore, data, com, ID_Tirocinio, Att);


 %>
<jsp:forward page="Homepage.jsp" />
 
