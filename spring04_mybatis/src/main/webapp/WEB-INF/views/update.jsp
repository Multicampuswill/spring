<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
회원수정요청됨.!<br>
<!-- model.addAttribute("dto",dto); EL로 프린트! -->
수정요청된 회원아이디 ${dto.id}<br>
수정완료된 회원전화번호 ${dto.tel}
</body>
</html>