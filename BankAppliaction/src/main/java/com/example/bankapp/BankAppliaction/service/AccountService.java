package com.example.bankapp.BankAppliaction.service;

import com.example.bankapp.BankAppliaction.entity.Account;

import java.util.*;

public interface AccountService {
    //we will give all the methods that we are going to implement

    public Account createAccount(Account account);

    public Account getAccountDetailsByAccountNumber(Long accountNumber);

    public List<Account> getAllAccountDetails();

    public Account depositAmount(Long accountNumber, Double Amount);

    public Account withdrawAmount(Long accountNumber, Double Amount);

    public void closeAccount(Long accountNumber);
}