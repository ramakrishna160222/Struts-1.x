<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<body>
<center><h1>  Employee Crud Operation </h1>

<html:form action="empcrud">


	<p>ID:			<html:text property="id" /></p>

	<p>NAME:		<html:text property="name" /></p>
	
	<p>EMAIL:			<html:text property="email" />	</p>
	
	<p>ADDRESS:		<html:text property="address" /></p>	


<html:submit property="submit">save</html:submit>		<html:submit property="submit">update</html:submit>
<html:submit property="submit">delete</html:submit>		<html:submit property="submit">find</html:submit>
					<html:submit property="submit">findAll</html:submit>

</html:form>

</body>
</html>