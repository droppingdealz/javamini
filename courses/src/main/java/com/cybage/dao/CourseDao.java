package com.cybage.dao;

import java.util.List;

import com.cybage.model.Course;

public interface CourseDao {
	
	public List<Course> findCourses() throws Exception;

}
