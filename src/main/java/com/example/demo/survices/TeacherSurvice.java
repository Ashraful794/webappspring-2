package com.example.demo.survices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeacherDao;

import com.example.demo.entities.Teacher;

@Service
public class TeacherSurvice implements ITeacherSurvice{

	@Autowired
	TeacherDao teacherDao;
	
	@Override
	public List<Teacher> getTeacher() {
		// TODO Auto-generated method stub
		return teacherDao.findAll();
	}

	@Override
	public Teacher getTeacher(int id) {
		// TODO Auto-generated method stub
		return teacherDao.getOne(id);
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		Teacher entity=teacherDao.getOne(id);
		teacherDao.delete(entity);
		
	}

}
