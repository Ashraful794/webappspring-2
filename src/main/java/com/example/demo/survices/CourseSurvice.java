package com.example.demo.survices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entities.Course;

@Service
public class CourseSurvice implements ICourseSurvice {

	@Autowired
	private CourseDao courseDao;
		
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(int id) {

		return courseDao.getOne(id);
		
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);		
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		courseDao.save(course);
		return course;		
		
	}

	@Override
	public void deleteCourse(int id) {
			
		Course entity=courseDao.getOne(id);
		courseDao.delete(entity);
		
	}
	

}
