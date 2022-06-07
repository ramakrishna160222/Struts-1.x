<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>Reg Form</h1>

<html:form action="reg" method="post">
	<table>
		<tr>
			<td>ID:</td>
			<td><html:text property="id" /></td>		
		</tr>
		<tr>
			<td>NAME:</td>
			<td><html:text property="name" value="${list.name}" /></td>	
		</tr>
		<tr>
			<td>EMAIL:</td>
			<td><html:text property="email" /></td>			
		</tr>
		<tr>
			<td>ADDRESS:</td>
			<td><html:textarea property="address" /></td>
			
		</tr>			
		<tr>
		<td></td>
		<td><html:submit value="Register"/></td>
		
		<td><a href="view.do">View</a>
		</tr>
	</table>
	
</html:form>