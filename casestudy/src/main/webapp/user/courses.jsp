<%@page import="com.cybage.model.Courses"%>
<%@page import="java.util.List"%>

<br>
<table border="1">
	<tr>
		<td>category id</td>
		<td>category name</td>
		<td>Image Url</td>
		<td>category id</td>
		<td>category id</td>
		<td>category id</td>
		<td>category id</td>
		<td>category id</td>


	</tr>
	<%
	List<Courses> courses = (List) request.getAttribute("courses");
	for (Courses u : courses) {
			out.print("<tr>");
			out.print("<td>" + u.getId() + "</td>");
			out.print("<td>" + u.getName() + "</td>");
			out.print("<td>" + u.getPrice() + "</td>");
			out.print("<td>" + u.getDuration() + "</td>");
			out.print("<td>" + u.getAuthor() + "</td>");
			out.print("<td>" + u.getDescription() + "</td>");
			out.print("<td>" + u.getImage() + "</td>");
			out.print("<td>" + u.getSub() + "</td>");
		
			out.print("</tr>");
		}
	%>

</table>

