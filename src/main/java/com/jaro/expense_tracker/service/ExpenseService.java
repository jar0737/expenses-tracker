package com.jaro.expense_tracker.service;

import com.jaro.expense_tracker.exceptions.ResourceNotFoundException;
import com.jaro.expense_tracker.model.Expense;
import com.jaro.expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import com.jaro.expense_tracker.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public interface ExpenseService {
    Expense saveExpense(Expense expense);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    void deleteExpense(Long id);

}