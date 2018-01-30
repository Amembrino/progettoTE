  <%@page import="java.sql.*" %>
<%@page import="Db.Connector" %>

<%@page import="GestDomTirocino.DomaTirociDAO"%>
 <jsp:useBean id="DirAz" class="bean.DirigenteAzienda" scope="session"/> 
 

 <jsp:useBean id="listaDomande" 
		    class="bean.ListDomandeTiro"
		     scope="request"/>
 <%
 DomaTirociDAO dom= new  DomaTirociDAO();
	
int id=Integer.parseInt(request.getParameter("iddomanda"));
dom.firmaDirAz(id);

 /**Connection con= Connector.getConnection();
 ResultSet rs;
	
 String query3="SELECT azienda.Dir_AziendaEmail FROM domanda_di_tirocinio, Azienda where domanda_di_tirocinio.Id_Documento='"+id+"' ";
	try{
		java.sql.Statement  stmt3 = con.createStatement();
		 rs=stmt3.executeQuery(query3);
		 
while(rs.next())
		 {
dom.compilaDoma(doma, rs.getString("Dir_AziendaEmail"));
		 }

stmt3.close();
con.close();
	 }
	catch(Exception ex){System.out.println(ex);
	 }
*/

 
 //dom.fillListaDomandeTAZ(listaDomande, tutorAz.getEmail());

 %>
<jsp:forward page="Homepage.jsp" />