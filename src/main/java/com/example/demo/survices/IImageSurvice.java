package com.example.demo.survices;

import org.springframework.web.multipart.MultipartFile;

public interface IImageSurvice {
	
	public void uploadImage(MultipartFile file)throws Exception;
	

}
