package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.cybage.model.Course;
import com.cybage.util.DbUtil;

public class CourseDaoImpl implements CourseDao {
	
	public List<Course> findCourses() throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "select course_id,course_name,course_price,course_duration,course_author,course_description,image_url,total_sub_course from course";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		
		List<Course> courses = new ArrayList<Course>();
		while (rs.next()) {
			Course course = new Course();
			course.setCourse_id(rs.getInt(1));
			course.setCourse_name(rs.getString(2));
			course.setCourse_price(rs.getInt(3));
			course.setCourse_duration(rs.getInt(4));
			course.setCourse_author(rs.getString(5));
			course.setCourse_description(rs.getString(6));
			course.setImage_url(rs.getString(7));
			course.setTotal_sub_course(rs.getInt(8));

			courses.add(course);
		}
		return courses;
	}

}
