<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/api/jquery/jquery-1.8.3.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/commons.css" rel="stylesheet">

<title>Login</title>
</head>
<body id="loginBody" onload="document.f.j_username.focus();">
	<div id="loginDiv">
		<form name="f" action="${pageContext.request.contextPath}/j_spring_security_check" method="POST">
			<table style="width: 100%; height: 320px;">
				<tr>
					<td width="100%"></td>
					<td style="background-color: white;">
						<table style="margin: 10px;">
							<tr>
								<td>
									<div id="LoginLogoDiv"></div>
								</td>
							</tr>
							<tr>
								<td>User:</td>
							</tr>
							<tr>
								<td><input type="text" name="j_username" value=""></td>
							</tr>
							<tr>
								<td>Password:</td>
							</tr>
							<tr>
								<td><input type="password" name="j_password" /></td>
							</tr>
							<tr>
								<td>
									<div style="padding-top: 10px;">
										<input name="submit" type="submit" value="Login" />
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div style="height: 50px;">
										<c:if test="${not empty param.login_error}">
											<!-- Display error message -->
											<c:if test="${not empty param.login_error}">
												<table align="center">
													<tr>
														<td><font color="red"> Your login attempt was not successful, please try again.</font></td>
													</tr>
													<tr>
														<td><font color="red">Reason: <c:out
															value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />. </font></td>
													</tr>
												</table>
											</c:if>
										</c:if>
									</div>

								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

		</form>
	</div>
</body>


</html>