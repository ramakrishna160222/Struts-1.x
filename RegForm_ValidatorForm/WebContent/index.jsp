<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>


<h1>Reg Form</h1>
<html:form action="reg" method="post" onsubmit="return validatorRF(this);">
<html:javascript formName="RF"  />
<pre>
ID:			<html:text property="id" /><html:errors property="id" />
NAME:		<html:text property="name" /><html:errors property="name" />
EMAIL:		<html:text property="email" /><html:errors property="email" />
SALARY:		<html:text property="salary" /><html:errors property="salary" />
CREDITCARD:  <html:text property="creditcard" /><html:errors property="creditcard" />
PHONE:		 <html:text property="phone" /><html:errors property="phone" />
			  <html:submit value="Register" />

</pre>

</html:form>
