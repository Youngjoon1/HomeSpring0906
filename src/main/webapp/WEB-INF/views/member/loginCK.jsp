<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${result == 1}">
			<script>
				alert("로그인 성공");
			</script>
			<h1>로그인 성공</h1>
		</c:when>
		<c:otherwise>
			<script>
				alert("로그인 실패");
				location.href="loginForm";
			</script>
		</c:otherwise>
	
	</c:choose>
</body>
</html>