package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
@Table(name="Image_table")
@Component
public class Image {
	

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String path;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}
	public Image(int id, String path) {
		this.id = id;
		this.path = path;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}


}
