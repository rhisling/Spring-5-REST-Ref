package me.aravindh.springmvcrest.services;

import me.aravindh.springmvcrest.api.v1.model.CategoryDTO;
import me.aravindh.springmvcrest.api.v1.model.CategoryListDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
