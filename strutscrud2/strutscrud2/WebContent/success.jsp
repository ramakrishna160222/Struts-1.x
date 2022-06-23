<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>Success</h1>
<html:form action="delete" >
	ENTER ID TO DELETE STUDENT:
			<html:text property="id" />
			<html:submit value="delete" />				
</html:form>