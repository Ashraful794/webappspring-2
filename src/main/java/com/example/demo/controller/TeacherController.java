package com.example.demo.controller;

import java.util.List;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Teacher;
import com.example.demo.survices.ITeacherSurvice;


@RestController
public class TeacherController {
	
	
	@Autowired
	private ITeacherSurvice teacherSurvice;
	
	
	@GetMapping("/teacher")
	public List<Teacher> getTeachers()
	{
		return this.teacherSurvice.getTeacher();
	}
	
	@GetMapping("/teacher/{teacherId}")	
	public Teacher getCourse(@PathVariable String teacherId)
	{
		return this.teacherSurvice.getTeacher(Integer.parseInt(teacherId));
	}
	
	@PostMapping("/addTeacher")
	public Teacher addCourse(@RequestBody Teacher teacher)
	{
		return this.teacherSurvice.addTeacher(teacher);
	}
	
	@PutMapping("/updateTeacher/{teacher}")
	public Teacher updateCourse(@RequestBody Teacher teacher)
	{
		return this.teacherSurvice.updateTeacher(teacher);
	}
	
	
	@DeleteMapping("/teacher/{teacherId}")
	public ResponseEntity<HttpStatus> deleteTeacher(@PathVariable String teacherId)
	{
		try
		{
			this.teacherSurvice.deleteTeacher(Integer.parseInt(teacherId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	

	}
	
	
}
