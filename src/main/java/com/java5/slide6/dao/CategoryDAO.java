package com.java5.slide6.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.java5.slide6.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{
}