package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.survices.IImageSurvice;


@RestController
public class ImageController {
	
	@Autowired
	private IImageSurvice imageSurvice;
	
	@PostMapping("/upload-image")
	public void uploadImage(@RequestParam("file") MultipartFile file) throws Exception
	{
		imageSurvice.uploadImage(file);
	}
	
	

}
