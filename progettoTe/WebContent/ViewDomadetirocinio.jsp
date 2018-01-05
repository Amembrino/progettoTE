<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.ListDomandeTiro"%>
<%@page import="bean.DomandaTirocinio"%>

<jsp:useBean id="listaDomande"
             class="bean.ListDomandeTiro"
             scope="request" />
             
 <jsp:useBean id="tutorAz" class="bean.tutorAz" scope="session"/>
               

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>domande tirocinio</title>
</head>
<body>
<% 
Connection newConnection = null;
try{
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

String ip = "localhost";
String port = "3306";
String db = "tiro";
String username = "root";
String password = "root";

newConnection = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
 Statement st  = newConnection.createStatement();
String mailta=tutorAz.getEmail();
String sql = "SELECT* FROM  domandatirocinio where TutorAziendaleEmail= '"+mailta+"' ";
ResultSet rs = st.executeQuery(sql);
while(rs.next()){
    //Retrieve by column name
    int id  = rs.getInt("IdDoccumento");
    String azienda = rs.getString("Azienda");
    String data = rs.getDate("data").toString();
    String FirmatutorUniversitario = rs.getString("FirmatutorUniversitario");
    String TirocinanteEmail=rs.getString("TirocinanteEmail");
     
    System.out.print("ID: " + id);
    System.out.print(", Azienda: " + azienda);
    System.out.print(", data: " + data);
    System.out.println(", email tiro: " + TirocinanteEmail);
    
   out.print("<table border=\"1\">") ;
    out.print("<tr> <td> id domanda:"+id +"</td><td> data domanda"+data+" </td><td>  email tirocinate"+TirocinanteEmail + "</td><tr>" );
    out.print("</table>") ;
     
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

/* //  for (DomandaTirocinio domanda : listaDomande.getDomande()  ) {
                    System.out.println(domanda.getId_Documento());
                 
                    String desc = domanda.getTirocinanteEmail();
                     
                    
                    out.print("<div>");
                    out.print("<h3> "+domanda.getId_Documento()+"</h3>");
                    out.print("<p class=\"descrizioned\" >"+desc+"</p>");
                
                    out.print("<p class=>il:" +domanda.getData()+"</p>");
                    
                    out.println("</div>");
                    System.out.println("domanda  "+domanda.getId_Documento() );
                   }
               */
                %>

</body>
</html>