<%-- 
    Document   : Display_Company_Names
    Created on : Apr 26, 2017, 7:40:42 PM
    Author     : Suvarna
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <p>  </p> 
       
        
        <h1> <a><b>Trucking Application</b> </a></h1>
        <h2>The companies using Trucking Application are :</h2>
        
        <%  List<String> list = (List<String>)request.getAttribute("list");    
for(String category : list) {
    out.println(category);
}
 %>
        
        
        <table>
  <c:forEach var="list1" items="${list}" >
    <tr>
      <td>${list1}</td>
    </tr>
  </c:forEach>
</table>
    </body>
</html>
