package com.kuki.springboot.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kuki.springboot.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}