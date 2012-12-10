<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>

	<form:form method="post" modelAttribute="docUser"
		action="${pageContext.request.contextPath}/um/docusers/update">
		
		<form:hidden path="id"/>
		
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
		</table>


		<input type="submit" value="update"/> 
		<button onclick="window.location.href='${pageContext.request.contextPath}/um/docusers'; return false;">Cancel</button>
	</form:form>
</body>
</html>