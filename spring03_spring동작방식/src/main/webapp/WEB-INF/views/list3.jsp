<%@page import="com.multi.mvc003.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- page지시자: 톰킷에게 이 페이지에 대한 정보를 주는 지시내용 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <!-- taglib지시자 : html이외의 태그를 만들어서 사용할 수 있음.
 					자바 기본 문법, 스트링포맷팅 
 					Java Standard Tag Library(JSTL)
 					자바 문법을 스크립트릿을 사용하기가 
 					불편하기 때문에
 					자바 문법을 태그로 할 수 있게 하기 위해!
  -->   
    <!DOCTYPE html>
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
<!-- for문 1)c타입, 2)for-each(*), 3)iterator(반복자) -->
<c:forEach var="bag" items="${list}">
<table border="1" class="table table-dark table-hover">
			<tr>
				<td class="t1">검색 id :</td>
				<td>${bag.id}</td>
			</tr>
			<tr>
				<td class="t1">검색 img :</td>
				<td>${bag.img}</td>
			</tr>
			<tr>
				<td class="t1">검색 price :</td>
				<td>${bag.price}</td>
			</tr>
			<tr>
				<td class="t1">검색 title :</td>
				<td>${bag.title}</td>
			</tr>
			<tr>
				<td class="t1">검색 content :</td>
				<td>${bag.content}</td>
			</tr>
		
		</table>
		<br>
</c:forEach>
</body>
</html>






