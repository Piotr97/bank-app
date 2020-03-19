package com.piotr.bank.controller;

import com.piotr.bank.model.dto.request.TransactionDTO;
import com.piotr.bank.model.entity.Transaction;
import com.piotr.bank.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TransactionController {
    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transaction/all")
    public List<Transaction> allTransaction() {
        return transactionService.allTransaction();
    }

    @PostMapping("/transaction/add")
    public Transaction addTransaction(@RequestBody TransactionDTO transactionDTO) {
        return transactionService.newTransaction(transactionDTO);
    }
}
