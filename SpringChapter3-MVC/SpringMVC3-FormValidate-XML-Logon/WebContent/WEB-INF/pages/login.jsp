<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>

	<h2>${message}</h2>
	<form:form method="POST" commandName="loginForm">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td><form:label path="userId">User Id:</form:label></td>
				<td><form:input path="userId" /></td>
				<td><form:errors path="userId" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssClass="error" />
			</tr>


			<tr>
				<td>Remember Me :</td>
				<td><form:checkbox path="rememberMe" value="Y" />Yes</td>
				<td><form:errors path="rememberMe" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Keep me logged on for :</td>
				<td><form:radiobuttons path="daysCount" items="${dayList}" />Days
				</td>
				<td><form:errors path="daysCount" cssClass="error" /></td>
			</tr>

			<tr>
				<td>User Role :</td>
				<td><form:select path="userRole">
						<form:option value="blank" label="--- Select ---" />
						<form:options items="${roleList}" />
					</form:select></td>
				<td><form:errors path="userRole" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>