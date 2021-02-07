package com.cybage.service;

import java.util.List;

import com.cybage.dao.CoursesDao;
import com.cybage.dao.UserDao;
import com.cybage.model.Courses;
import com.cybage.model.User;

public class CourseServiceImpl implements CourseService{
	
	
	private CoursesDao courseDao;
	public CourseServiceImpl(CoursesDao CoursesDao) {
		this.courseDao = courseDao;
	}
	public List<Courses> findCourse() throws Exception {
		// TODO Auto-generated method stub
		return courseDao.findCourse();
	}

	}