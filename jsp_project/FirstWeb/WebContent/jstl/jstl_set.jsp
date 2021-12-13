<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	Member member = new Member("이강인", 30);
 	request.setAttribute("member", member);
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="appName" value="JSP Program" scope="application"></c:set>
	1. application 영역에 appName 속성이 있는지 확인 <br>
	2. 속성 생성 또는 덮어 쓰는 처리
	
	<c:set var="name" value="JSP" scope="session"></c:set>
	
	<hr>
	${member.name} <br>
	
	저장된 속성의 변수 값을 변경 <br>
	
	<c:set value="손흥민" target="${member}" property="name"></c:set>
	
	${member.name}
	
</body>
</html>