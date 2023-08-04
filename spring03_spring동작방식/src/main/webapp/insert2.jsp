<%@page import="com.multi.mvc003.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1. 클라이언트가 입력한 데이터를 받아서
    	//2. 가방을 만들어서 가방에 다 넣어라.
    	//3. dao만들어서 가방을 주면서  Insert해달라고 요청!
    %>
	<jsp:useBean id="bag" class="com.multi.mvc003.MemberDTO"></jsp:useBean>    
	<jsp:setProperty property="*" name="bag"/>
	<%
	//스크립트릿 
	MemberDAO dao = new MemberDAO();
	dao.insert(bag);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입해달라고 dao에 요청함.!
</body>
</html>