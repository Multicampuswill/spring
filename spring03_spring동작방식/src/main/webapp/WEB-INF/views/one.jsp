<%@page import="com.multi.mvc003.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
body { /* 컨트롤 + / - 자동주석, 태그선택! */
	background: #18de02;
}

button {
	background: pink;
}

.t1 { /* .은 클래스 선택!, 여러개선택!  */
	background: yellow;
	width: 150px;
	text-align: center;
}
</style>
</head>
<body>
<!-- http://localhost:8898/web002/one.jsp?id=summer 
	질의문자열, 쿼리스트링!
-->
<!-- http의 header(요청주소+Get방식으로 넘어가는 데이터) -->
<table border="1" class="table table-dark table-hover">
			<tr>
				<td class="t1">검색할 아이디 :</td>
				<td>${bag.id}</td>
				<%
				//EL!!!
					MemberDTO bag = (MemberDTO)request.getAttribute("bag");
					out.println(bag.getId());				
				%>
			</tr>
			<tr>
				<td class="t1">검색할 전화번호 :</td>
				<td>${bag.pw}</td>
			</tr>
			<tr>
				<td class="t1">검색할 이름 :</td>
				<td>${bag.name}</td>
			</tr>
			<tr>
				<td class="t1">검색할 전화번호 :</td>
				<td>${bag.tel}</td>
			</tr>
		
		</table>

</body>
</html>






