/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcc.services.impl;

import com.cloudinary.Cloudinary;
import com.hcc.pojo.Category;
import com.hcc.pojo.Product;
import com.hcc.repositories.CategoryRepository;
import com.hcc.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repo;


    @Override
    public List<Category> getCate() {
        return this.repo.getCate();
    }



}
