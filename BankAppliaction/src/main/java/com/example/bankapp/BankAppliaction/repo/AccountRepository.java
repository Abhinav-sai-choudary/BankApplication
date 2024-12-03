package com.example.bankapp.BankAppliaction.repo;

import com.example.bankapp.BankAppliaction.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
