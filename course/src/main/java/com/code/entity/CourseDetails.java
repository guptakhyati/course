package com.code.entity;


public class CourseDetails {

	private int id;          
	private String courseName;     
	private String courseBaseCourse;
	private long courseFees;
	private int courseDuration;

	private int collegeid;
	private College college;
	
	//private int collegeId(references college.id);//Foreign key

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseBaseCourse() {
		return courseBaseCourse;
	}

	public void setCourseBaseCourse(String courseBaseCourse) {
		this.courseBaseCourse = courseBaseCourse;
	}

	public long getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(long courseFees) {
		this.courseFees = courseFees;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}


	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public int getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
}
