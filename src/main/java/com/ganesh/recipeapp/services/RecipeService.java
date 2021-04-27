package com.ganesh.recipeapp.services;

import com.ganesh.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
