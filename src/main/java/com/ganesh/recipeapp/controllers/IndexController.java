package com.ganesh.recipeapp.controllers;

import com.ganesh.recipeapp.domain.Category;
import com.ganesh.recipeapp.domain.UnitOfMeasure;
import com.ganesh.recipeapp.repositories.CategoryRepository;
import com.ganesh.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("");

        System.out.println("category id: " + categoryOptional.get().getId());
        System.out.println("unitOfMeasure id: "+ unitOfMeasureOptional.toString());
        return "index";
    }
}
