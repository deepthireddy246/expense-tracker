package com.example.expensetracker.controller;

import com.example.expensetracker.dto.ExpenseDTO;
import com.example.expensetracker.entity.Expense;
import com.example.expensetracker.entity.User;
import com.example.expensetracker.service.ExpenseService;
import com.example.expensetracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<ExpenseDTO>> getExpenses(@AuthenticationPrincipal UserDetails userDetails) {
        User user = userService.findByUsername(userDetails.getUsername()).orElseThrow();
        List<ExpenseDTO> expenses = expenseService.getExpensesByUser(user).stream().map(this::toDTO).collect(Collectors.toList());
        return ResponseEntity.ok(expenses);
    }

    @PostMapping
    public ResponseEntity<ExpenseDTO> addExpense(@AuthenticationPrincipal UserDetails userDetails, @RequestBody ExpenseDTO dto) {
        User user = userService.findByUsername(userDetails.getUsername()).orElseThrow();
        Expense expense = Expense.builder()
                .user(user)
                .type(dto.getType())
                .category(dto.getCategory())
                .amount(dto.getAmount())
                .description(dto.getDescription())
                .date(dto.getDate())
                .build();
        Expense saved = expenseService.save(expense);
        return ResponseEntity.ok(toDTO(saved));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExpense(@PathVariable Long id) {
        expenseService.delete(id);
        return ResponseEntity.ok().build();
    }

    private ExpenseDTO toDTO(Expense expense) {
        ExpenseDTO dto = new ExpenseDTO();
        dto.setId(expense.getId());
        dto.setType(expense.getType());
        dto.setCategory(expense.getCategory());
        dto.setAmount(expense.getAmount());
        dto.setDescription(expense.getDescription());
        dto.setDate(expense.getDate());
        return dto;
    }
} 