package com.example.demo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Teacher_table")
public class Teacher {
	
	@Id
	private int id;
	private String name;
	private String image;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@OneToMany(targetEntity=Course.class, cascade=CascadeType.ALL)
	@JoinColumn(name="ct_fk", referencedColumnName="id")
	private List<Course> course;
	
	@OneToOne(targetEntity=ContactInfo.class, cascade=CascadeType.ALL)
	@JoinColumn(name="tc_fk", referencedColumnName="id")
	private ContactInfo contactInfo;
	
	
	
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

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
