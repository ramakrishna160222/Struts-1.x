<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>Student Reg Form</h1>

<html:form action="reg" method="POST">
<pre>

NAME: <html:text property="name" /><html:errors property="name_e" />
EMAIL: <html:text property="email" /><html:errors property="email_e" />
ADDRESS: <html:text property="address" /> <html:errors property="address_e" />

<html:submit value="Register" />
</pre>
</html:form>