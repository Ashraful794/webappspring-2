package com.example.demo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="Teacher_table")
public class Teacher {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(targetEntity=Course.class, cascade=CascadeType.ALL)
	@JoinColumn(name="ct_fk", referencedColumnName="id")
	private List<Course> course;
	
	
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Teacher() {};
	
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	

}
