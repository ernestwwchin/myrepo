<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="post" action="um/docusers/add">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
		</table>
		
		<input type="submit" />
	</form:form>


</body>
</html>