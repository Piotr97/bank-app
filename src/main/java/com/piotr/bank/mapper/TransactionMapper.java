package com.piotr.bank.mapper;

import com.piotr.bank.model.dto.request.TransactionDTO;
import com.piotr.bank.model.entity.Account;
import com.piotr.bank.model.entity.Transaction;

public abstract class TransactionMapper {
    public static Transaction map(TransactionDTO transactionDTO, Account from, Account to){
        Transaction transaction = new Transaction();
        transaction.setTransactionType(transactionDTO.getTransactionType());
        transaction.setTo(to);
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setDate(transactionDTO.getDate());
        transaction.setFrom(from);
        return transaction;
    }
}
