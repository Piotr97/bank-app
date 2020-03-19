package com.piotr.bank.exception;

public enum ExceptionCode {
    NOT_ENOUGH_BALANCE("T_001" , "Account dont't have enough many money",400);

    ExceptionCode(String code, String details, int httpStatus) {

    }
}
