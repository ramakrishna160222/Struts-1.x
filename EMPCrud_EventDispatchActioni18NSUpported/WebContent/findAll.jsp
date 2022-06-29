<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<center>
<table border="1">
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Address</th>
</tr>
<c:forEach items="${reslist }" var="list">
<tr>
	<td><c:out value="${list.id }" /></td>
	<td><c:out value="${list.name }" /></td>
	<td><c:out value="${list.email }" /></td>
	<td><c:out value="${list.address }" /></td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>