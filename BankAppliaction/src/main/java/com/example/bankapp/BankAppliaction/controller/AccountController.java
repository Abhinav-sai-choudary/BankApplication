package com.example.bankapp.BankAppliaction.controller;

import com.example.bankapp.BankAppliaction.entity.Account;

import com.example.bankapp.BankAppliaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService service;

    //CREATE ACCOUNT
    @PostMapping("/create")
    public ResponseEntity<Account>  createAccount(@RequestBody Account account){
        Account createAccount = service.createAccount(account);



        return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);

    }

}
