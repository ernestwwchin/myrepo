<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List User</title>
</head>
<body>

<div>
	<a href="${pageContext.request.contextPath}/um/docusers/add">Add New</a>
</div>
<table class="datatable">
	<tr>
		<th>No</th>
		<th>Name</th>
		<th>Created</th>
		<th>Modified</th>
		<th>Action</th>
	</tr>
<c:forEach items="${docUsers }" var="item" varStatus="sts">
	<tr>
		<td>
			${sts.count}
		</td>
		<td>
			${item.name }
		</td>
		<td>
			<fmt:formatDate value="${item.created }" pattern="yyyy-MM-dd HH:mm:ss"/>
		</td>
		<td>
			<fmt:formatDate value="${item.modified }" pattern="yyyy-MM-dd HH:mm:ss"/>
		</td>
		<td>
			<a href="${pageContext.request.contextPath}/um/docusers/edit?docUserId=${item.id}">edit</a>
			<a href="${pageContext.request.contextPath}/um/docusers/delete?docUserId=${item.id}">delete</a>
		</td>
	</tr>
</c:forEach>	
</table>

</body>
</html>