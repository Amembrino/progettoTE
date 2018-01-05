<%@page import="bean.ListDomandeTiro"%>
<%@page import="bean.DomandaTirocinio"%>

<jsp:useBean id="listaDomande"
             class="bean.ListDomandeTiro"
             scope="request" />
               

 
             
<jsp:useBean id="tiroc" class="bean.Tirocinante" scope="session"/>
<jsp:useBean id="tutAz" class="bean.tutorAz" scope="session"/>
<jsp:useBean id="tutUNI" class="bean.TutorUni" scope="session"/>

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
   for (DomandaTirocinio d : listaDomande.getDomande()  ) {
                    
                    String desc = d.getTirocinanteEmail();
                      if (desc != null && desc.length() > 100)
                        desc = desc.substring(0, 100);
                    
                    out.print("<dd>");
                    out.print("<h3 class=\"titolod\" ><a href=\"doVisualizzaDomanda.jsp?iddomanda="+d.getId_Documento()+"\"></a></h3>");
                    out.print("<p class=\"descrizioned\" >"+desc+"</p>");
                  /*  out.print("<p class=\"utented\">Postata da:"+d.getUtente()+"</p>");*/
                    out.print("<p class=\"datacreazioned\">il:"+d.getData()+"</p>");
                    //out.print("<p class=\"categoriad\">categ:"+d.getCategoria()+"</p>");
                    
                   /*  if (userData.isValid() && d.isMine(userData.getUserid()) ) {
                     out.print("<p><a class=\"delete\" href=\"doCancellaDomanda.jsp?iddomanda="+d.getIddomanda()+"\">Cancella</a></p>");*/
                     
                    out.println("</dd>");
                   }
               
                %>

</body>
</html>