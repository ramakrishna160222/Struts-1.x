<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1>usersuccess</h1>

<html:form action="userreg">
	<pre>
	
	NAME:<html:text property="name" />
	EMAIL:<html:text property="email" />
	ADDRESS:<html:text property="address" />
	<html:submit value="UserReg" />
	
	</pre>


</html:form>