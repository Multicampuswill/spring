<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//alert('회원가입 페이지입니다. 반갑습니다.!')
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

#b1 { /* #은 아이디 선택!, 특정한 것 한 개만 선택! */
	color: red;
}
#b2{
	color: blue;
	
}
</style>
</head>
<body>
	<h3>회원가입 페이지</h3>
	<hr>
	<a href="member.jsp">
		<button id="b1">첫페이지로</button>
	</a>
	<img src="resources/img/dance.jpg" width="300" height="300">
	<!--form의 action은 무조건 jsp파일이되어야만 함. -->
	<form action="insert">
		<table border="1">
			<tr>
				<td class="t1">아이디 :</td>
				<td><input name="id"></td>
			</tr>
			<tr>
				<td class="t1">비밀번호 :</td>
				<td><input name="pw" value="1234"></td>
			</tr>
			<tr>
				<td class="t1">회원이름 :</td>
				<td><input name="name" value="a"></td>
			</tr>
			<tr>
				<td class="t1">회원전화 :</td>
				<td><input name="tel" value="011"></td>
			</tr>
			<tr>
				<td colspan="2" class="t1">
					<button id="b2">회원가입 데이터 전송</button>
				</td>
			</tr>
		</table>
		<!-- 입력한 값들이 서버(톰킷)으로 전달될때는 form태그 안에 있어야 함. -->
		<!-- 보충내용: <input name="data"> -->
	</form>

	
	
	
	

	
</body>
</html>