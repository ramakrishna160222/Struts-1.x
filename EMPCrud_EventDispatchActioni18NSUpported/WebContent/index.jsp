<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<center>
<h1 style="color:red"><bean:message key="title" /></h1>
<html:form action="empcrud" method="post">
<pre>
<bean:message key="id" />	<html:text property="id" /><br>
<bean:message key="name" />	<html:text property="name" /><br>
<bean:message key="email" />   <html:text property="email" /><br>
       <bean:message key="address" /> 	<html:text property="address" />	<br>
<html:submit property="empsave"><bean:message key="save" /></html:submit>  <html:submit property="empupdate"><bean:message key="update" /></html:submit><br>
<html:submit property="empdelete"><bean:message key="delete" /></html:submit> <html:submit property="empfind"><bean:message key="find" /></html:submit><br>
<html:submit property="empfindAll"><bean:message key="findAll" /></html:submit>

<a href="./changelang.do?lang=en">English</a><br>
<a href="./changelang.do?lang=te">Telugu</a><br>
</pre>
</html:form>
</center>