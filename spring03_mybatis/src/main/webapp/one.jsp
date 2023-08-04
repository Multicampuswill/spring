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
<a href="list">회원 전체 목록</a>
<form action="one" method="get">
<table border="1" class="table table-dark table-hover">
			<tr>
				<td class="t1">검색할 아이디 :</td>
				<td><input name="id" value="summer"></td>
			</tr>
			<tr>
				<td colspan="2" class="t1">
					<button id="b2" class="btn btn-danger">검색할 id 데이터 전송</button>
				</td>
			</tr>
		</table>

</form>
</body>
</html>






