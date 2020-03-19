package com.piotr.bank.exception;

public class DomainException extends RuntimeException {
    private ExceptionCode exceptionCode;

    public DomainException(ExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
}
