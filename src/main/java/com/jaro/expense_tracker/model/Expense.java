package com.jaro.expense_tracker.model;


//Imports
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    protected Long id;
    protected LocalDate date;
    protected String title;
    protected BigDecimal amount;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Expense(String title, BigDecimal amount, Category category, LocalDate date){
        this.title = title;
        this.amount = amount;
        this.date = date;
    }


}
