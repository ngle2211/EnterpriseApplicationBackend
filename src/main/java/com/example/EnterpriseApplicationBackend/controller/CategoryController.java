package com.example.EnterpriseApplicationBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.EnterpriseApplicationBackend.model.Category;
import com.example.EnterpriseApplicationBackend.service.CategoryService;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
}
