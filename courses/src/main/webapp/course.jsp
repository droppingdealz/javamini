<%@page import="com.cybage.model.Course"%>
<%@page import="java.util.List"%>

<br>
<table border="1">
	<tr>
		<td>Course ID</td>
		<td>Course Name</td>
		<td>Course Price</td>
		<td>Course Duration</td>
		<td>Course Author</td>
		<td>Course Description</td>
		<td>Course Image_url</td>
		<td>Course Total Sub Course</td>


	</tr>
	<%
	List<Course> courses = (List) request.getAttribute("courses");
	for (Course c : courses) {
			out.print("<td>" + c.getCourse_id() + "</td>");
			out.print("<td>" + c.getCourse_name() + "</td>");
			out.print("<td>" + c.getCourse_price() + "</td>");
			out.print("<td>" + c.getCourse_duration() + "</td>");
			out.print("<td>" + c.getCourse_author() + "</td>");
			out.print("<td>" + c.getCourse_description() + "</td>");
			out.print("<td>" + c.getImage_url() + "</td>");
			out.print("<td>" + c.getTotal_sub_course() + "</td>");
		
			out.print("</tr>");
		}
	%>

</table>

