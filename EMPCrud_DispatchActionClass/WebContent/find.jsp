
<%@page import="beans.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>

<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
</head>
<body>

<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
	</tr>
	<c:forEach items="${reslist}"   var="reslist">
		<c:out value="${reslist}" /><br>
	</c:forEach>
	

	
	
</table>


</body>
</html>

