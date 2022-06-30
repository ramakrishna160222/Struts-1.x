<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<center>
<pre>
<h1>Employee CRUD Page</h1>
<html:form action="empcrud">
Id:	<html:text property="id" />

Name: <html:text property="name" />

Email:<html:text property="email" />

gender: 		<html:radio property="gender" value="Male" />Male
			  <html:radio property="gender" value="FeMale" />FeMale

username:<html:text property="username" />

password:<html:text property="password" />

<html:submit property="submit">save</html:submit> 		<html:submit property="submit">update</html:submit><br><br>
<html:submit property="submit">delete</html:submit> 	<html:submit property="submit">find</html:submit><br>
<html:submit property="submit">findAll</html:submit>


</html:form>
</pre>
<a href="login.jsp"><h1>Login Page</h1></a>

</center>
