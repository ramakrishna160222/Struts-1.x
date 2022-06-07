<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>Hello Form</h1>	
<html:form action="hello">
Name: <html:text property="name" /><html:errors />
<html:submit value="Hello" />
</html:form>