 <%@page import="gestRegTir.RegistroDAO"%>
 <%@ page import="java.text.*,java.util.*" session="false"%>
 
 
  <%
 int ore=Integer.parseInt(request.getParameter("bags"));
 
   
     
     String data =  request.getParameter("date" );
   
  String com= request.getParameter("comments");
  
  RegistroDAO Reg= new RegistroDAO();
  Reg.RegistroTirocinante(ore, data, com);
   
  %>
  