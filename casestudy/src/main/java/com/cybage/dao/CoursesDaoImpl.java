package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Courses;
import com.cybage.model.User;
import com.cybage.util.DbUtil;

public class CoursesDaoImpl implements CoursesDao {

	public List<Courses> findCourse() throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "select course_id,course_name,course_price,course_duration,course_author,courses_description,image_url,total_sub_course from course";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Courses> courses = new ArrayList<Courses>();
		while (rs.next()) {
			Courses course = new Courses();
			course.setId(rs.getInt(1));
			course.setName(rs.getString(2));
			course.setPrice(rs.getInt(1));
			course.setDuration(rs.getInt(1));
			course.setAuthor(rs.getString(1));
			course.setDescription(rs.getString(1));
			course.setImage(rs.getString(1));
			course.setSub(rs.getInt(1));

			courses.add(course);
		}
		return courses;
	}
}

	