package com.jaro.expense_tracker.repository;

import com.jaro.expense_tracker.model.Category;
import com.jaro.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
