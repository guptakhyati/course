package com.code.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.entity.College;
import com.code.entity.Course;
import com.code.entity.CourseDetails;
import com.code.repository.CourseRepository;
import com.code.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired CourseRepository courseRepository;
	@Autowired ApiCall apiCall;

	@Override 
	public CourseDetails getById(int id) {
		Course course =courseRepository.findById(id).orElse(null);
		
		College college=apiCall.getCollegeDetails(course.getCollegeid());
		CourseDetails cd= new CourseDetails();
		BeanUtils.copyProperties(course, cd);
		cd.setCollege(college);
		return cd;
		//return course;
	}

	@Override
	public List<Course> getAll() {
		List<Course> courseList=courseRepository.findAll();
		return courseList;
	}
	
	@Override
	public boolean create(Course course) {
		System.out.print("id-"+course.getId()+", name-"+course.getCourseName()+", duration-"+course.getCourseDuration());
		courseRepository.save(course);
		return true;
	}

	@Override
	public boolean update(Course course) {
		courseRepository.save(course);
		return true;
	}

	@Override
	public boolean delete(int id) {
		courseRepository.deleteById(id);
		return true;
	}
	

}
