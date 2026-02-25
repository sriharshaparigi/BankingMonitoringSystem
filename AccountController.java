package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


    @PostMapping("/accounts")
    public void insertAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.findAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.findAccountById(id);
    }


}
