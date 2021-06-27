package com.ganesh.recipeapp.controllers;

import com.ganesh.recipeapp.domain.Category;
import com.ganesh.recipeapp.domain.UnitOfMeasure;
import com.ganesh.recipeapp.repositories.CategoryRepository;
import com.ganesh.recipeapp.repositories.UnitOfMeasureRepository;
import com.ganesh.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
