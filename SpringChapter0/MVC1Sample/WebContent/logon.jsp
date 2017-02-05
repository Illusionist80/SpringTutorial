<%@page import="model.BankDBHelper"%>
<%@page import="model.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon Page</title>
</head>
<body>

<jsp:useBean id="uiBean" class="model.UserBean" scope="page">  
 <jsp:setProperty  name="uiBean" property="*" />  
</jsp:useBean>  
 
<%  
String errorMessage = "";  
 if(request.getParameter("submit") != null){  
  	String userName=uiBean.getUserid();
  	String password=uiBean.getPassword();
	 
   if(new BankDBHelper().validateLogon(userName, password)){  
    RequestDispatcher dispatcher = request.getRequestDispatcher("useraccounts.jsp");  
    dispatcher.forward(request, response);  
   }else{  
	   
    errorMessage = "Invalid  login details..Please Retry!";  
   }  
 }  
%>  
<h3><font color="red"><%= errorMessage %></font></h3>
<form action="logon.jsp">
 Login Name <input type="text" name="userid"></input> 
 <br>
 Password    <input type="password" name="password"></input> 
 <br><br>
 <input type="submit" value="Submit" name="submit"></input>
</form>

<br>
<a href="bankhomepage.jsp">Click here to go back to homepage</a>
</body>
</html>
