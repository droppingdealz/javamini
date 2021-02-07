<%@page import="com.cybage.model.User"%>
<%@page import="java.util.List"%>

<br>
<table border="1">
	<tr>
		<td>category id</td>
		<td>category name </td>
		<td>Image Url</td>
	
	</tr>
	<%
		List<User> users = (List) request.getAttribute("users");
		for (User u : users) {
			out.print("<tr>");
			out.print("<td>" + u.getId() + "</td>");
			out.print("<td>" + u.getName() + "</td>");
			out.print("<td>" + u.getAddress() + "</td>");

			out.print("</tr>");
		}
	%>

</table>

