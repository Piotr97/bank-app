package com.piotr.bank.controller;

import com.piotr.bank.model.entity.Account;
import com.piotr.bank.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody Account account){
        accountService.addUser(account);


    }
}
