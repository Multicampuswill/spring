<%@page import="com.multi.mvc004.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--taglib지시자, tomcat에게 c붙은 태그를 어떻게 처리할지 지시!  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
회원 목록 검색결과!<br>
<!-- model.addAttribute("list",list); EL로 프린트! -->
<c:forEach items="${list}" var="dto">
검색된 회원아이디 ${dto.id}<br>
검색된 회원패스워드 ${dto.pw}<br>
검색된 회원이름 ${dto.name}<br>
검색된 회원전화번호 ${dto.tel}<hr>
</c:forEach>
</body>
</html>