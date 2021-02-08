package com.cybage.service;

import java.util.List;

import com.cybage.dao.CourseDao;
import com.cybage.model.Course;


public class CourseServiceImpl implements CourseService {

	private CourseDao courseDao;
	public CourseServiceImpl(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public List<Course> findCourses() throws Exception{
		return courseDao.findCourses();
	}
}
