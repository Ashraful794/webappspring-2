package com.example.demo.survices;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.ImageDao;
import com.example.demo.entities.Image;
@Service
public class ImageSurvice implements IImageSurvice {

	@Autowired
	ImageDao imageDao;
	
	@Autowired
	Image image;
	
	@Override
	public void uploadImage(MultipartFile file)throws Exception
	
	{
		// TODO Auto-generated method stub

		
		try
		{
			String Path_Directory="E:\\Problem Solving New\\webappspring-2\\src\\main\\resources\\static\\image";
//			String Path_Directory=new ClassPathResource("/image").getFile().getAbsolutePath();
			Files.copy(file.getInputStream(), Paths.get(Path_Directory+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			
			image.setPath(Path_Directory+file.getOriginalFilename());
			
			imageDao.save(image);
			
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
	}


}
