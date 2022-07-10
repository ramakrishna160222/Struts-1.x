<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>employeeSuccess</h1>

<html:form action="employeereg">
<pre>

NAME:<html:text property="name" />
EMAIL:<html:text property="email" />
ADDRESS:<html:text property="address" />
<html:submit value="Employee Register" ></html:submit>


</pre>
</html:form>