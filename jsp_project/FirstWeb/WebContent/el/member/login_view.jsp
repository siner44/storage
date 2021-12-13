<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>view 페이지</h1>
	<h3>데이터 받아서 데이터를 출력한다. 다른 자바 연산은 하지 않는다.</h3>
	<hr>
	result : ${requestScope.result} <br>
	${param.uid}/${param.pw}
	
	
</body>
</html>