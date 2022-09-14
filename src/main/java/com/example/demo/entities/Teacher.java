package com.example.demo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
@Table(name="Teacher_table")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;

	@OneToMany(targetEntity=Course.class, cascade=CascadeType.ALL)
	@JoinColumn(name="ct_fk", referencedColumnName="id")
	private List<Course> course;
	
	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	@OneToOne(targetEntity=ContactInfo.class, cascade=CascadeType.ALL)
	@JoinColumn(name="tc_fk", referencedColumnName="id")
	private ContactInfo contactInfo;
	
	
	
	@OneToMany(targetEntity=Image.class, cascade=CascadeType.ALL)
	@JoinColumn(name="it_fk", referencedColumnName="id")
	private List<Image> image;
		
	
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
