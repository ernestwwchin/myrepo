<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach items="${docUsers }" var="item">
	<tr>
		<td>
			${item.id}
		</td>
		<td>
			${item.name }
		</td>
		<td>
			${item.created }
		</td>
		<td>
			${item.modified }
		</td>
	</tr>
</c:forEach>	
</table>

	<form:form method="post" modelAttribute="docuser" action="${pageContext.request.contextPath}/um/docusers/add" >
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