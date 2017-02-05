<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Accounts</title>
</head>
<body>

<h3>Your Accounts Page ... Mr.<bean:write name="LoginForm" property="userName"></bean:write></h3>

<%-- Get data from model which interacts with DB --%>
<h5>Accounts A(Balance 1234.00)</h5>
<h5>Accounts B(Balance 56789.00)</h5>

<br>
<a href="usercards.do">Your Cards..</a>
<br>
<a href="userloans.do">Your loans..</a>

<br>
<a href="home.do">Click here to go back to homepage</a>
</body>
</html>