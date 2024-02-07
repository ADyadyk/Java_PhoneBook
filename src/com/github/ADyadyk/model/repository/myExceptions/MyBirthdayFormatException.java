package com.github.ADyadyk.model.repository.myExceptions;

public class MyBirthdayFormatException extends RuntimeException{
    public MyBirthdayFormatException() {
        super("Формат даты неправильный!");
    }
}
