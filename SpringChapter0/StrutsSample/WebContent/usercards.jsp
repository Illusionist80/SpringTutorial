<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Cards</title>
</head>
<body>
<h3>Your Cards List</h3>
<%-- Get data from model which interacts with DB

BankDBHelper.getCardDatafromDB();

 --%>

<h5>Card A(Balance -234.00)</h5>
<h5>Card B(Balance 0.00)</h5>
<br>

<a href="userloans.do">Your Loans and offers</a>
<br>
<a href="useraccounts.do"> My Account</a>
<br>
<a href="home.do">Click here to go back to homepage</a>
</body>
</html>