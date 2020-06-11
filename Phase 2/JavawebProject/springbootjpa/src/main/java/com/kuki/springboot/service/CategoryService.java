package com.kuki.springboot.service;

import org.springframework.data.domain.Pageable;

import com.kuki.springboot.pojo.Category;
import com.kuki.springboot.util.Page4Navigator;

public interface CategoryService {

    public Page4Navigator<Category> list(Pageable pageable);

    public void save(Category category);

    public void delete(int id);

    public Category get(int id);
}