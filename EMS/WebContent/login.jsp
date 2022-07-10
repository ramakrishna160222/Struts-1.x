<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1>Login Form</h1>

<html:form action="login">
<pre>
USERNAME:<html:text property="uname" /><html:errors property="uname" />
PASSWORD:<html:text property="pwd" /><html:errors property="pwd" />
ROLE: <html:select property="role">
		<html:option value="admin">ADMIN</html:option>
		<html:option value="employee">Employee</html:option>
		<html:option value="user">User</html:option>
	  </html:select>
	<html:submit value="Login" />
<html:link action="adminforward" module="admin">Click</html:link>



</pre>
</html:form>