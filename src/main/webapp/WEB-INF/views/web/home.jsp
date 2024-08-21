<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Chào bạn: ${account.fullName} </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<p style="margin-top:10px;"><img src="${pageContext.servletContext.contextPath}/${account.avatar}" class="rounded-circle" width="40"/> 
		<b>${pageContext.request.userPrincipal.name}</b>
			<a href="<c:url value='/logout'/>">Thoát</a>
		</p>
		<hr>
		<h3>${msg}</h3>
		<p>Chào bạn: ${account.fullName} </p>
	</div>
</body>
</html>