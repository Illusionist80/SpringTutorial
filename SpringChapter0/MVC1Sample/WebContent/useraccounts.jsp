<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Accounts</title>
</head>
<body>

<h3>Your Accounts Page</h3>

<%-- Get data from model which interacts with DB

BankDBHelper.getAccountDatafromDB();

 --%>
<h5>Accounts A(Balance 1234.00)</h5>
<h5>Accounts B(Balance 56789.00)</h5>

<br>
<a href="usercards.jsp">Your Cards..</a>
<br>
<a href="userloans.jsp">Your loans..</a>

<br>
<a href="bankhomepage.jsp">Click here to go back to homepage</a>
</body>
</html>