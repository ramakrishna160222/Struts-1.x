<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>Student Reg Form</h1>

<html:form action="reg" method="POST">
<pre>

NAME: <html:text property="name" /> 
EMAIL: <html:text property="email" />
ADDRESS: <html:text property="address" /> 
<html:submit value="Register" />
</pre>
</html:form>