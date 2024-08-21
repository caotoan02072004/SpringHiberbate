<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông báo quyền hạn</title>
<link rel="stylesheet"	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h1 style="color:red;margin-top:10px;">${msg}!</h1>
<a href="javascript:history.back()">Quay lại</a>
</div>
</body>
</html>