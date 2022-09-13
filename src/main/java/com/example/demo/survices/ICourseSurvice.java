package com.example.demo.survices;

import java.util.List;

import com.example.demo.entities.Course;

public interface ICourseSurvice {
	
	public List<Course> getCourses();
	public Course getCourse(int id);	
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(int id);
	
	

}
