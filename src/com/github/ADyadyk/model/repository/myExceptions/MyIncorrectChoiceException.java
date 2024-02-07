package com.github.ADyadyk.model.repository.myExceptions;

public class MyIncorrectChoiceException extends RuntimeException{
    public MyIncorrectChoiceException() {
        super("Вы сделали некорректный выбор в меню. Повторите попытку.");
    }
}
