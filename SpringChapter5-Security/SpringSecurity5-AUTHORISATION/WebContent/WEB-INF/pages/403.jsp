<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>HTTP Status 403 - Access is denied</h1>
	<h3>Message : ${message}</h3>
	<a href="<c:url value="/j_spring_security_logout" />" > Click here to logout and login as admin</a>
</body>
</html>