package com.example.bankapp.BankAppliaction.service;

import com.example.bankapp.BankAppliaction.entity.Account;
import com.example.bankapp.BankAppliaction.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository repo;

    @Override
    public Account createAccount(Account account) {
        Account account_saved = repo.save(account);

        return account_saved;
    }

    @Override
    public Account getAccountDetailsByAccountNumber(Long accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        return null;
    }

    @Override
    public Account depositAmount(Long accountNumber, Double Amount) {
        return null;
    }

    @Override
    public Account withdrawAmount(Long accountNumber, Double Amount) {
        return null;
    }

    @Override
    public void closeAccount(Long accountNumber) {

    }
}
