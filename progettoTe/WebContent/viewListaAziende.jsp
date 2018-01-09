<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
 <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Connection newConnection = null;

try{
   
    Class.forName("com.mysql.jdbc.Driver");

String ip = "localhost";
String port = "3306";
String db = "tiro";
String username = "root";
String password = "root";

	newConnection = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
	Statement st  = newConnection.createStatement();
	
	String sql = "SELECT* FROM  azienda ";
	ResultSet rs = st.executeQuery(sql);

while(rs.next()){
    //Retrieve by column name
    int Id_Azienda  = rs.getInt("Id_Azienda");
    String Nome = rs.getString("Azienda");
    String SedeOperativa = rs.getString("SedeOperativa");
    String SedeAmministrativa = rs.getString("SedeAmministrativa");
    Boolean Convenzionata = rs.getBoolean("Convenzionata");
    String Dir_AziendaEmail = rs.getString("Dir_AziendaEmail");
    String Tutor_AziendaleEmail = rs.getString("Tutor_AziendaleEmail");
    
     System.out.print("Id_Azienda: " + Id_Azienda);
    System.out.print(" Azienda: " + Nome);
    System.out.print(" Sede Operativa: " + SedeOperativa);
    System.out.print(" Sede Amministrativa: " + SedeAmministrativa);
    //System.out.println(", Convenzionata: " + Convenzionata);
    System.out.println(" email Direttore Aziendale: " + Dir_AziendaEmail);
    System.out.println(", email Tutor Universitario: " + Tutor_AziendaleEmail);
}
	rs.close();
}catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
}catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
}finally{
 
	 
	 try{ newConnection.close();
	 }catch(SQLException se){
         se.printStackTrace();
      }
}
    %>
   
</body>
</html>