<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<center>  
<h1>Login Form</h1>
<html:form action="login">
Username:<html:text property="username" /><br><html:errors property="username" /><br><br>
Password:<html:text property="password" /><br><br><br>
<html:submit>Login</html:submit><br><br>

<span style="color:blue">If you are a New User! click here </span>			 <a href="reg.jsp">Register</a>
</html:form>
 </center>