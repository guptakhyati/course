package com.code.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.code.entity.Course;
import com.code.entity.CourseDetails;

@Service
public interface CourseService {
	
	
	CourseDetails getById(int courseId);
	List<Course> getAll();
	boolean create(Course course);
	boolean update(Course course);
	boolean delete(int courseId);
}