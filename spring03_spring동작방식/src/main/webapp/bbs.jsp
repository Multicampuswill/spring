<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//alert('게시판정보 페이지입니다. 반갑습니다.!')
</script>
<style type="text/css">
body { /* 컨트롤 + / - 자동주석, 태그선택! */
	background: #037BFC;
}

button {
	background: #18DE02;
}

.t1 { /* .은 클래스 선택!, 여러개선택!  */
	background: yellow;
	width: 150px;
	text-align: center;
}
</style>
</head>
<body>
	<h3>게시판정보 페이지</h3>
	<hr>
	<a href="index.jsp">
		<button id="b1">목차 페이지로</button>
	</a>
	<table border="1">
		<tr>
			<td class="t1">게시판 글쓰기 </td>
			<td><a href="bbs_insert.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판 글삭제</td>
			<td><a href="bbs_delete.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판 글수정</td>
			<td><a href="bbs_update.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판글 검색(상세페이지)</td>
			<td><a href="bbs_one.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판글 전체목록<br>(여러개)
			</td>
			<td><a href="bbs_list.jsp">
					<button>GO!!</button>
			</a></td>
		</tr>
	</table>
</body>
</html>