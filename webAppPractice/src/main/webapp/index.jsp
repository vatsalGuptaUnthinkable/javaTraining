<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<body>
<h2>First Home page</h2>
<% 
Object name = request.getAttribute("name");
%>
<h1> Hello my name is <%= name  %></h1>

</body>
</html>
