package com.example.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import com.example.demo.entity.ImageGallary;

public interface ServiceImage {
	void SaveImage(MultipartFile image);
	List<ImageGallary> getAll();
	
	public void CandidateDeleteById(Long id);
	public ImageGallary getCandidateById(Long id);
	public ImageGallary updateCandidate(ImageGallary imageGallary);
}
