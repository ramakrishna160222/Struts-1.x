<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Employee Home</h1>
<% String name=(String) session.getAttribute("username") ; %>
<h1 style="color:red">You have Successfully Logged in , Hii <mark><%= name %></mark></h1>

<a href="./logout.do"><h3>Logout</h3></a>

</body>
</html>