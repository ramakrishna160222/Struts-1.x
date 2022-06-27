<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<h1><bean:message key="title" /></h1>
<html:form action="empcrudform" method="post">
<pre>
<bean:message key="id" />		<html:text property="id" />
<bean:message key="name" />		<html:text property="name" />
<bean:message key="email" />	<html:text property="email" />
<bean:message key="address" />	<html:textarea property="address" />
<html:submit property="submit"><bean:message key="save" /></html:submit>
<html:submit property="submit"><bean:message key="update" /></html:submit>
<html:submit property="submit"><bean:message key="delete" /></html:submit>
<html:submit property="submit"><bean:message key="find" /></html:submit>
<html:submit property="submit"><bean:message key="findAll" /></html:submit>

<a href="./changelang.do?lang=en">English</a>
<a href="./changelang.do?lang=hi">Hindi</a>
</pre>
</html:form>