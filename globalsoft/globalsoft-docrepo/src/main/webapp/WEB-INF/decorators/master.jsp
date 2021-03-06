<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/api/jquery-ui-1.9.2/js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/api/jquery-ui-1.9.2/js/jquery-ui-1.9.2.custom.js"></script>
		<style type="text/css">
			@import url("${pageContext.request.contextPath}/resources/api/jquery-ui-1.9.2/css/ui-lightness/jquery-ui-1.9.2.custom.css");
			@import url("${pageContext.request.contextPath}/resources/css/commons.css");
		</style>
		<title>:: DOC Space <decorator:title /> ::</title>
	</head>
	<body id="commonBody">
		<div id="context">
			<div id="header">
				<a href="${pageContext.request.contextPath}">
					<img alt="home" src="${pageContext.request.contextPath}/resources/img/logo.png">
				</a>
			</div>
			<div id="sidebar">
				<div>
					<ul>
						<li>
						Maintenance
							<ul>
								<li><a href="${pageContext.request.contextPath}/sm/">System parameter</a></li>
								<li><a href="${pageContext.request.contextPath}/om/">Organization</a></li>
								<li><a href="${pageContext.request.contextPath}/um/docusers">User</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div id="main">
				<a href="${pageContext.request.contextPath }/j_spring_security_logout">Logout</a>
				
				<decorator:body />
			</div>
			<div id="footer">
				docspace build-0.0.1
			</div>
		</div>
	</body>
</html>
