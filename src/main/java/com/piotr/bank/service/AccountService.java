package com.piotr.bank.service;

import com.piotr.bank.model.OperationType;
import com.piotr.bank.model.entity.Account;
import com.piotr.bank.model.entity.Transaction;
import com.piotr.bank.repository.AccountRepository;
import com.piotr.bank.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class AccountService {

    private AccountRepository accountRepository;
    private TransactionRepository transactionRepository;

    public AccountService(AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @PostConstruct
    public void init() {

        Account account = new Account();
        account.setLogin("user");
        account.setPassword("user");
        account.setAccountNumber("5445656747676476");
        account.setBalance(new BigDecimal("20000.98"));
        accountRepository.save(account);

        Transaction transaction = new Transaction();
        transaction.setDate(LocalDate.now());
        transaction.setAmount(new BigDecimal("2000"));
        transaction.setTo(account);
        transaction.setFrom(account);
        transaction.setTransactionType(OperationType.DEPOSIT);
        transactionRepository.save(transaction);
    }

    public Account addUser(Account account){
        return accountRepository.save(account);
    }




}

//cykl zycia i metody