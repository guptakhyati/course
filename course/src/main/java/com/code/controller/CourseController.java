package com.code.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.entity.Course;
import com.code.entity.CourseDetails;
import com.code.service.CourseService;

@RestController
@RequestMapping(value= "/course")
public class CourseController {
	
	private static Logger logger=LoggerFactory.getLogger(CourseController.class);
	@Autowired CourseService courseService;
	
	
	@Value("${message:default message}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
	
	@GetMapping("/id")
	public CourseDetails getById(@RequestParam(value = "id", defaultValue = "1") int id) {
		logger.info("/id");
		return courseService.getById(id);
	}
	
	@GetMapping
	public List<Course> getAll() {
		return courseService.getAll();
	}
	
	@PostMapping
	public boolean create(@RequestBody(required=true) Course course) {
		return courseService.create(course);
	}
		
	@PutMapping
	public boolean update(@RequestBody Course course) {
		return courseService.update(course);
	}
	
	@DeleteMapping 
	public boolean delete(@RequestParam int id) {
		return courseService.delete(id);
	}
	
}