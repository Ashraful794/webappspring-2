package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
@Table(name="Contact_table")

public class ContactInfo {
	@Id
	private int id;
	private int mobileNumber;
	private String Address;
	
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	

}
