package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Image;

public interface ImageDao extends JpaRepository<Image,Integer>  {

}
