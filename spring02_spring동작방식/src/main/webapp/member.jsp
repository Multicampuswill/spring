<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	alert('회원정보 페이지입니다. 반갑습니다.!')
</script>
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
	<h3>회원정보 페이지</h3>
	<hr>
	<a href="index.jsp">
		<button id="b1">목차 페이지로</button>
	</a>
	<table border="1">
		<tr>
			<td class="t1">회원가입</td>
			<td><a href="insert.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원탈퇴</td>
			<td><a href="delete.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원수정</td>
			<td><a href="update.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원검색(한명)</td>
			<td><a href="one.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원전체목록<br>(여러명)
			</td>
			<td><a href="list.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
	</table>
</body>
</html>