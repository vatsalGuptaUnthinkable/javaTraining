<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Good you have logged In!</h1>
<%
String name = (String) request.getAttribute("name");

String password = (String) request.getAttribute("password");


%>
<h3>Hey your  username is : <%= name %> </h3>
<h3>Hey your  password is : <%= password %> </h3>
</body>
</html>