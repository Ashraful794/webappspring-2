package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ContactInfo;

public interface ContactInfoDao extends JpaRepository<ContactInfo,Integer>{

}
