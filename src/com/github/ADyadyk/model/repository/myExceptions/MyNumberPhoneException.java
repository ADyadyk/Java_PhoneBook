package com.github.ADyadyk.model.repository.myExceptions;

public class MyNumberPhoneException extends RuntimeException{
    public MyNumberPhoneException() {
        super("Номер телефона ввёдён не корректно");
    }
}
