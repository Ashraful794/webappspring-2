package com.example.demo.survices;

import java.util.List;

import com.example.demo.entities.Teacher;

public interface ITeacherSurvice {
	public List<Teacher> getTeacher();
	public Teacher getTeacher(int id);	
	public Teacher addTeacher(Teacher teacher);
	public Teacher updateTeacher(Teacher teacher);
	public void deleteTeacher(int id);

}
