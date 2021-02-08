package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.CourseDao;
import com.cybage.dao.CourseDaoImpl;
import com.cybage.model.Course;
import com.cybage.service.CourseService;
import com.cybage.service.CourseServiceImpl;

public class CourseController extends HttpServlet{
	
	private CourseDao courseDao = new CourseDaoImpl();

	private CourseService courseService = new CourseServiceImpl(courseDao);

	private static final long serialVersionUID = 1L;

	public CourseController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		System.out.println("inside user controller");

		String path = request.getPathInfo();

		if (path.equals("/list")) {
			System.out.println("inside list method....");
			try {
				List<Course> courses = courseService.findCourses();
				request.setAttribute("courses", courses);

				request.getRequestDispatcher("/course.jsp").forward(request, response);

			} catch (Exception e) {
				System.out.println("error occurred: " + e.getMessage());
			}
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
		

}
