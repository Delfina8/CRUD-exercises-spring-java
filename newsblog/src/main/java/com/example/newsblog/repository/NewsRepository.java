package com.example.newsblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newsblog.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long>{
	
}
