<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1>adminsuccess & Register</h1>
<html:form action="adminupdate">


<pre>
OLD UNAME:<html:text property="ouname" />
NEW UNAME:<html:text property="nuname" />
OLD PWD:<html:text property="opwd" />
NEW PWD:<html:text property="npwd" />
	<html:submit value="Admin_Update" />
</pre>

</html:form>