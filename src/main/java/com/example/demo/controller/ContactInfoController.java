package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ContactInfo;

import com.example.demo.survices.IContactInfoSurvice;


@RestController
public class ContactInfoController {
	
	@Autowired
	private IContactInfoSurvice contactInfoSurvice;
	
	@PostMapping("/addContactInfo")
	public ContactInfo addContactInfo(@RequestBody ContactInfo contactInfo)
	{
		return this.contactInfoSurvice.addContactInfo(contactInfo);
	}
	
	@PutMapping("/updateContactInfo/{contactinfo}")
	public ContactInfo updateContactInfo(@RequestBody ContactInfo contactInfo)
	{
		return this.contactInfoSurvice.updateContactInfo(contactInfo);
	}


}
