package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.entity.ImageGallary;
import com.example.demo.service.ServiceImage;

@Controller
public class ControllerImage {
	@Autowired
	ServiceImage serviceImage;
	
	@GetMapping("/")
	public String goToIndex() {
		return "index";
	}
	
	@GetMapping("/go")
	public String viewAll(Model model) {
		model.addAttribute("image", serviceImage.getAll());
		return "view";
	}

	@PostMapping("/show")
	public String saveCandidate(@RequestParam("img") MultipartFile file){
	    serviceImage.SaveImage(file);
		return "redirect:/go";
	}
	

	@RequestMapping("/jmz/{id}")
	public String deleteVal(@PathVariable Long id) {
		serviceImage.CandidateDeleteById(id);
		return "redirect:/go";
	}

	@GetMapping("/jmz/edit/{id}")
	public String editData(@PathVariable Long id,Model model) {
		model.addAttribute("candidate", serviceImage.getCandidateById(id));
		return "edit";
	}
	
	@PostMapping("/jmz/update/{id}")
	public String updateCandidateData(@PathVariable Long id,
			@ModelAttribute("image")ImageGallary img,
					Model model){
		ImageGallary cand=serviceImage.getCandidateById(id);
		cand.setImage(img.getImage());
		serviceImage.updateCandidate(cand);
		return "redirect:/";
	}
}
