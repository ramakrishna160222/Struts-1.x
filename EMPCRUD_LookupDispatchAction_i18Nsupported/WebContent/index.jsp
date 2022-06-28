<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<body>
<center><h1>  <bean:message key="title" /> </h1>
<html:form action="empcrud">
	<p><bean:message key="id" />	:		<html:text property="id" /></p>

	<p><bean:message key="name" />		:<html:text property="name" /></p>
	
	<p><bean:message key="email" />		:	<html:text property="email" />	</p>
	
	<p><bean:message key="address" />	: <html:text property="address" /></p>	
<html:submit property="submit"><bean:message key="save" /></html:submit>		<html:submit property="submit"><bean:message key="update" /></html:submit>
<html:submit property="submit"><bean:message key="delete" /></html:submit>		<html:submit property="submit"><bean:message key="find" /></html:submit>
				<html:submit property="submit"><bean:message key="findAll" /></html:submit>
</html:form>

<a href="./changelang.do?lang=en">English</a><br><br>
<a href="./changelang.do?lang=te">Telugu</a>
</body>
</html>