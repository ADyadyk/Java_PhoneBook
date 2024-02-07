package com.github.ADyadyk.model.repository.myExceptions;

public class MyDataInputException extends RuntimeException{
    public MyDataInputException() {
        super("Вы ввели не все данные");
    }
}
