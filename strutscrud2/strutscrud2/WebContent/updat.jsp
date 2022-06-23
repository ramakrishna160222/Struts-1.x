<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>Update</h1>
<html:form action="updat" >
	ENTER ID TO Update STUDENT:
			<html:text property="id" />
			<html:submit value="update" />				
</html:form>