package com.example.demo.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.entity.ImageGallary;
import com.example.demo.respo.ImgRespo;

@Service
public class ServiceImplementation implements ServiceImage{
	@Autowired
	ImgRespo imgRespo;
	
	@Override
	public void SaveImage(MultipartFile image) {
		
			ImageGallary imageGallary=new ImageGallary();
			try {
				imageGallary.setImage(Base64.getEncoder().encodeToString(image.getBytes()));
			} catch (IOException e) {
				e.printStackTrace();
				}
			imgRespo.save(imageGallary);
	}

	@Override
	public List<ImageGallary> getAll() {
		// TODO Auto-generated method stub
		return imgRespo.findAll();
	}
	@Override
	public void CandidateDeleteById(Long id) {
		// TODO Auto-generated method stub
		 imgRespo.deleteById(id);
	}
	
	@Override
	public ImageGallary getCandidateById(Long id) {
		// TODO Auto-generated method stub
		return imgRespo.getById(id);
	}

	@Override
	public ImageGallary updateCandidate(ImageGallary imageGallary) {
		// TODO Auto-generated method stub
		return imgRespo.save(imageGallary);
	}
}
