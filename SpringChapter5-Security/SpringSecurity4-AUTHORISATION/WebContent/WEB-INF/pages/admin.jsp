<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h3>Message : ${message}</h3>	
	<h3>Admin Username : ${username}</h3>	
	
	<a href="/SpringSecurity4-AUTHORISATION/welcome"><b>Application Page</b></a>
	<br />
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	
</body>
</html>