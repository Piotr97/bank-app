package com.piotr.bank.controller;
import com.piotr.bank.service.TransactionService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransactionController {
    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    
}
