package com.code.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;          
	private String courseName;     
	private String courseBaseCourse;
	private long courseFees;
	private int courseDuration;

	private int collegeid;
	
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

	public int getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}

	
}