<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception 처리</title>
</head>
<body>
에러타입은: 
<%= exception.getClass().getName() %><br>
에러메시지 확인:
<%= exception.getMessage() %>
</body>
</html>

