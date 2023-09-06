<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<h1>member_list</h1>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		<c:forEach var="member" items="${list }">
		<tr>
			<td>${member.id}</td>
			<td>${member.pwd}</td>
			<td><a href="info?id=${member.id}">${member.name}</a></td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="3"><a href="loginForm">index이동</a></td>
		</tr>
	</table>
	
</body>
</html>