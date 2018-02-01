 
 <%@ page import = "java.io.*,java.util.*" %>
<%
 session = request.getSession(false);

if(session!=null){
	System.out.println("logout");
	
session.invalidate();
}


%>

<jsp:forward page="index.jsp" />