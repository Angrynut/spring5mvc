<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request
            .getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basepath%>">
</head>
<body>
	<h2>Test 4</h2>
	<p>${ sth }</p>
	<p>${ test }</p>
	<p>${ petId }</p>
</body>
</html>
