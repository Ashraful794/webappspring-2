package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.survices.ICourseSurvice;

@RestController
public class HomeController {

	@Autowired
	private ICourseSurvice courseSurvice;
	
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseSurvice.getCourses();
	}
	
	@GetMapping("/course/{courseId}")	
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseSurvice.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseSurvice.addCourse(course);
	}
	
	@PutMapping("/updatecourses/{course}")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseSurvice.updateCourse(course);
	}
	
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try
		{
			this.courseSurvice.deleteCourse(Integer.parseInt(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	
	
	
	
	
}
