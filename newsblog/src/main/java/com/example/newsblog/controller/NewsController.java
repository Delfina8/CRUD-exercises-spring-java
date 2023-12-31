package com.example.newsblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.newsblog.model.News;
import com.example.newsblog.repository.NewsRepository;

@RestController
@RequestMapping("/news")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class NewsController {
	
	@Autowired
	private NewsRepository newsRepository;
	
	@GetMapping
	public ResponseEntity<List<News>> getAll(){
		return ResponseEntity.ok(newsRepository.findAll());
	}

}
