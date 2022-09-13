package com.example.demo.survices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactInfoDao;
import com.example.demo.entities.ContactInfo;


@Service
public class ContactInfoSurvice implements IContactInfoSurvice {

	@Autowired
	private ContactInfoDao contactInfoDao; 
	
	@Override
	public ContactInfo addContactInfo(ContactInfo contactInfo) {
		// TODO Auto-generated method stub
		contactInfoDao.save(contactInfo);
		return contactInfo;
	}

	@Override
	public ContactInfo updateContactInfo(ContactInfo contactInfo) {
		// TODO Auto-generated method stub
		
	    contactInfoDao.save(contactInfo);
		return contactInfo;
	}

}
