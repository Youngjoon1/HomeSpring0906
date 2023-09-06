<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	
	<form action="loginCK" method="post">
		id : <input type="text" name="id"><br>
		pwd : <input type="text" name="pwd"><br>
		<input type="submit" value="로그인">
	</form>
	<a href="joinForm">회원가입</a>
	<a href="member_list">모든 회원보기</a>
	
</body>
</html>