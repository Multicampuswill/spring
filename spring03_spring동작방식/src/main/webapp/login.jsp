<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

#b1 { /* #은 아이디 선택!, 특정한 것 한 개만 선택! */
	color: red;
}
#b2{
	color: blue;
	
}
</style>
</head>
<body>
	<h3>로그인 페이지</h3>
	<hr>
	<a href="member.jsp">
		<button id="b1">첫페이지로</button>
	</a>
	<img src="resources/img/dance.jpg" width="300" height="300">
	<form action="login">
		<table border="1">
			<tr>
				<td class="t1">아이디 :</td>
				<td><input name="id" value="apple"></td>
			</tr>
			<tr>
				<td class="t1">비밀번호 :</td>
				<td><input name="pw" value="1234"></td>
			</tr>
			
			<tr>
				<td colspan="2" class="t1">
					<button id="b2">로그인 데이터 전송</button>
				</td>
			</tr>
		</table>
	</form>

	
	
	
	

	
</body>
</html>