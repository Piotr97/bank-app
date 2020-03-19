package com.piotr.bank.model.dto.request;

import com.piotr.bank.model.OperationType;
import com.piotr.bank.model.entity.Account;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionDTO {
    private String fromAccountNumber;
    private String toAccountNumber;
    private LocalDate date;
    private BigDecimal amount;
    private OperationType transactionType;

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public OperationType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(OperationType transactionType) {
        this.transactionType = transactionType;
    }
}
