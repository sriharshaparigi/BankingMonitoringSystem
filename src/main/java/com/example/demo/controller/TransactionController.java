package com.example.demo.controller;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {


    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions")
    public void insertTransactions(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionService.findTransactions();
    }

    @GetMapping("/transactions/{id}")
    public Transaction getTransactions(@PathVariable  Long id) {
        return transactionService.findTransactionById(id);
    }


}
