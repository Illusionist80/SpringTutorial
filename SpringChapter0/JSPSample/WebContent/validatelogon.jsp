<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon</title>
</head>
<body>

<%  String userid = request.getParameter("userid") ;
String password = request.getParameter("password") ;

System.out.println(userid);
System.out.println(password);

if("usera".equals(userid) && "passa".equals(password))
{

response.sendRedirect("useraccounts.jsp");
} else {%>
<h3>Invalid Logon Details</h3>
<% } %>
<br>
<a href="logon.jsp"> Retry Login...</a><br>
<a href="bankhomepage.jsp">Click here to go back to homepage</a>
</body>
</html>