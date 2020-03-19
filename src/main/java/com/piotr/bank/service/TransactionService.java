package com.piotr.bank.service;

import com.piotr.bank.exception.DomainException;
import com.piotr.bank.exception.ExceptionCode;
import com.piotr.bank.mapper.TransactionMapper;
import com.piotr.bank.model.dto.request.TransactionDTO;
import com.piotr.bank.model.entity.Account;
import com.piotr.bank.model.entity.Transaction;
import com.piotr.bank.repository.AccountRepository;
import com.piotr.bank.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;

    public TransactionService(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    public List<Transaction> allTransaction() {
        return transactionRepository.findAll();
    }

    public Transaction newTransaction(TransactionDTO transactionDTO) {
        Account to = accountRepository.findAccountByAccountNumber(transactionDTO.getToAccountNumber());
        Account from = accountRepository.findAccountByAccountNumber(transactionDTO.getFromAccountNumber());
        Transaction transaction = TransactionMapper.map(transactionDTO,from,to);
        BigDecimal balance = from.getBalance();
        if (balance.equals(BigDecimal.ZERO) || balance.compareTo(transactionDTO.getAmount()) < 0) {
            throw new DomainException(ExceptionCode.NOT_ENOUGH_BALANCE);
    }
       // else if (  ) //todo rzucic wyjatek jak bedzie za mala kwota
        return transactionRepository.save(transaction);
    }

}
