package com.cybage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Courses;

public interface CoursesDao {
	public List<Courses> findCourse() throws Exception;
}
