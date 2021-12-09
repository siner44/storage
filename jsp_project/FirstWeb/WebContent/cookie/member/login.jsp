<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// COokieBox 이용해서 id를 저장하고 -> 다른 페이지로 이동할 때 로그인 유무를 판단

	// 사용자 요청 정보: id, pw를 받아서 쿠키에 저장
	// id/pw 값이 일치할 때 저장

	// 데이터 받기
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	// id/pw 값이 일치할 때 저장: 로그인 처리
	if (id.equals(pw)) {
		response.addCookie(CookieBox.createCookie("LOGIN", "SUCCESS", -1, "/"));
		// http://localhost:8080/....
		response.addCookie(CookieBox.createCookie("ID", id, -1, "/"));

		String save = request.getParameter("save");

		if (save != null && save.equals("on")) {
			response.addCookie(CookieBox.createCookie("save", id, 60 * 60 * 24 * 365, "/"));
		} else {
			response.addCookie(CookieBox.createCookie("save", "", 0, "/"));
		}
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>로그인 되었습니다.</h1>
	<h3>
		<a href="<%=request.getContextPath()%>/cookie/member/mypage.jsp">mypage</a>
	</h3>


</body>
</html>
<%
	} else {
%>
<script>
	alert('로그인 실패');
	history.go(-1);
</script>
<%
	}
%>