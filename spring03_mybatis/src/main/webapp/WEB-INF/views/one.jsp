<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
회원검색결과!<br>
<!-- model.addAttribute("dto",dto); EL로 프린트! -->
검색된 회원아이디 ${dto.id}<br>
검색된 회원패스워드 ${dto.pw}<br>
검색된 회원이름 ${dto.name}<br>
검색된 회원전화번호 ${dto.tel}<br>
검색된 회원날짜 ${dto.date}<hr>
</body>
</html>