<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 선택한 영화 제목은 ${title}<br>
당신이 선택한 영화의 현재 금액은 ${price}<br>
<a href="pay2.do?total=${price}">최종 결제금액</a>
</body>
</html>