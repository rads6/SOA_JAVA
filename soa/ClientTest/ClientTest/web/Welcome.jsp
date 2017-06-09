<%-- 
    Document   : Welcome
    Created on : Apr 26, 2017, 12:10:46 PM
    Author     : Suvarna
--%>
<%@page import="java.util.Date"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>style.css></style>
        <title>Home Page</title>
    </head>
    <%
        Date date = new Date();

    %>    

    <body>

        <h1>Welcome to Trucking Application</h1>


        <form action="${pageContext.request.contextPath}/MyServlet" method="post">
            <table border="5">
                <thead>
                    <tr>
                        <th>Available Services</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="submit" name="button1" value="Find Company " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Find Customer " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Find Invoice " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Customer Details Search " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Customer Details Search " /></td>
                    </tr>
                    <tr>
                        <td>            <input type="submit" name="button1" value="TruckNo Search " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="EmployeeID Search " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Display Route " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Transaction ID search " /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="button1" value="Pincode " /></td>
                    </tr>
                </tbody>
            </table>










        </form>



    </body>
</html>
