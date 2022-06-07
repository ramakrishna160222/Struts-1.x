
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
</head>
<body>
<table>
<tr>

<th>Name</th>
<th>Email</th>
<th>Address</th>
</tr>
<tr>

<logic:iterate name="list"  id="s">
   
  <td><bean:write name="s" property="name" /></td>
 <td> <bean:write name="s" property="email"/></td>
 <td> <bean:write name="s" property="address" /></td>
</logic:iterate>

</tr>
 


</table>


</body>
</html>

