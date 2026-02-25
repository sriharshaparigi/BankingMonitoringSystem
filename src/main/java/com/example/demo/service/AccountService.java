package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> findAccounts() {
        return accountRepository.findAll();
    }

    public Account findAccountById(Long id) {
       return accountRepository.findById(id).
               orElseThrow(() -> new RuntimeException("Account not found with ID: " + id));
    }

}
