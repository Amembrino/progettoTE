 
<%@page import="bean.Attività"%>
<%@page import="bean.Registro"%>
<%@page import="tirocinio.registro.gestore.RegistroDao"%>
  
   <jsp:useBean id="tirocinan" class="bean.Tirocinante" scope="session"/>
     
 
  <%
  
 // System.out.println("ID="+re.getId());
 // System.out.println("ema "+tirocinan.getEmail());
  
  int ID_Tirocinio;
	
   int ore=Integer.parseInt(request.getParameter("bags"));
   String data =  request.getParameter("date" );
   String com= request.getParameter("comments");

   RegistroDao Reg= new RegistroDao();
 
    int idatt=Reg.ID_att();
   idatt++;
   ID_Tirocinio=Reg.selectId(tirocinan.getEmail());
  
   boolean y = Reg.compilaRegistro(ore, data, com, ID_Tirocinio, idatt);

   if (y){

       Reg.setRegistroFalse(ID_Tirocinio);

        %>

         <jsp:forward page="Homepage.jsp" />  

        <%

   }  

   

   if (ID_Tirocinio==0){
       
       %>

     <jsp:forward page="ERRORE.jsp"/>  

    <%

   }

 
   %>