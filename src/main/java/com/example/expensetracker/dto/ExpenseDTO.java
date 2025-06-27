package com.example.expensetracker.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ExpenseDTO {
    private Long id;
    private String type;
    private String category;
    private BigDecimal amount;
    private String description;
    private LocalDateTime date;
} 