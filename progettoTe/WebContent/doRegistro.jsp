 <%@page import="java.sql.*" %>
<%@page import="Db.Connector" %>

<%@page import="gestRegTir.Registro"%>
<%@page import="gestRegTir.RegistroDAO"%>
<%@page import="gestRegTir.Attività"%>

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
 
