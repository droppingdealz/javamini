package com.cybage.model;

public class Course {
	
	private int course_id;
	private String course_name;
	private int course_price;
	private int course_duration;
	private String course_author;
	private String course_description;
	private String image_url;
	private int total_sub_course;
	
	
	public Course() {
		super();
	}
	
	public Course(int course_id,String course_name,int course_price,int course_duration, String course_author, String course_description, String image_url,int total_sub_course) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_price = course_price;
		this.course_duration = course_duration;
		this.course_author = course_author;
		this.course_description = course_description;
		this.image_url = image_url;
		this.total_sub_course = total_sub_course;
		
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCourse_price() {
		return course_price;
	}

	public void setCourse_price(int course_price) {
		this.course_price = course_price;
	}

	public int getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}

	public String getCourse_author() {
		return course_author;
	}

	public void setCourse_author(String course_author) {
		this.course_author = course_author;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public int getTotal_sub_course() {
		return total_sub_course;
	}

	public void setTotal_sub_course(int total_sub_course) {
		this.total_sub_course = total_sub_course;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_price=" + course_price
				+ ", course_duration=" + course_duration + ", course_author=" + course_author + ", course_description="
				+ course_description + ", image_url=" + image_url + ", total_sub_course=" + total_sub_course + "]";
	}
	
	

}
