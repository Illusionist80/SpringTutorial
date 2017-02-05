<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon Page</title>
</head>
<body>
<form action="ControllerServlet?command=logon" method="post">
 Login Name <input type="text" name="userName"></input> 
 <br>
 Password    <input type="password" name="password" ></input> 
 <br><br>
 <button>Submit</button>
</form>

<br>
<a href="ControllerServlet?command=home">Click here to go back to homepage</a>
</body>
</html>