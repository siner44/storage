<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setAttribute("member", new Member("손흥민", 30));	
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${false}">
		참일 때 보여짐.
	</c:if>
	
	<c:if test="${member.age > 20}">
		${member.name}(${member.age})
	</c:if>

	<br>
	
	<c:if test="${member.age >= 20}" var="chk" scope="session"/>

</body>
</html>