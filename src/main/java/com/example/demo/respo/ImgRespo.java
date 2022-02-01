package com.example.demo.respo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ImageGallary;

public interface ImgRespo extends JpaRepository<ImageGallary, Long>{
}
