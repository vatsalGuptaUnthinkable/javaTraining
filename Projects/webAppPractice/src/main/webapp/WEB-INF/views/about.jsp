<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About page</title>
</head>
<body>
<% String name = (String) request.getAttribute("name");  %>
<h1> Hey my name is <%=name %> And this is the about page of my organization  </h1>
</body>
</html>