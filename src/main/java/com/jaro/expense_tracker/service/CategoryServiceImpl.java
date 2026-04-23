package com.jaro.expense_tracker.service;

import com.jaro.expense_tracker.exceptions.ResourceNotFoundException;
import com.jaro.expense_tracker.model.Category;
import com.jaro.expense_tracker.repository.CategoryRepository;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {

        this.categoryRepository = categoryRepository;
    }

    // CREATE / UPDATE
    public Category saveCategory(Category category) {

        return categoryRepository.save(category);
    }

    // GET ALL
    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
    }

    // GET ONE
    public Category getCategoryById(Long id) {

        return categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + id));
    }

    // DELETE
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
