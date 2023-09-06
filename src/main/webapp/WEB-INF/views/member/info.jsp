<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<h1>개인정보</h1>
	id: ${user.id}<br>
	pwd: ${user.pwd }<br>
	name: ${user.name}<br>
	<a href="member_list">목록으로 이동</a><br>
</body>
</html>