package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cybage.dao.CoursesDao;
import com.cybage.dao.CoursesDaoImpl;
import com.cybage.model.Courses;
import com.cybage.service.CourseService;
import com.cybage.service.CourseServiceImpl;

public class CoursesController extends HttpServlet {
	
	private CoursesDao courseDao = new CoursesDaoImpl();

	private CourseService courseService = new CourseServiceImpl(courseDao);

	private static final long serialVersionUID = 1L;

	public CoursesController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		System.out.println("inside Course controller");

		String path = request.getPathInfo();

		if (path.equals("/lists")) {
			System.out.println("inside list method....");
			try {
				List<Courses> courses = courseService.findCourse();
				request.setAttribute("courses", courses);

				request.getRequestDispatcher("/user/courses.jsp").forward(request, response);

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



