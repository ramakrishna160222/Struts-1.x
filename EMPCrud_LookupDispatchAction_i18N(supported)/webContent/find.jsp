<%@page import="java.util.List"%>
<pre>
<% 
List l=(List)request.getAttribute("list");

%>
ID				Name			Email		Address
<%=l.get(1) %> <%= l.get(1) %> <%= l.get(2) %> <%= l.get(3) %>
</pre>