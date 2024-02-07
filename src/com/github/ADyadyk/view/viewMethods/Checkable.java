package com.github.ADyadyk.view.viewMethods;

public interface Checkable {
    /**
     * Проверка выбранного пункта в меню
     */
    boolean selectionСheck(int number);
    /**
     * Проверка номера телефона
     */
    boolean checkPhone(String number);
    /**
     * Проверка даты рождения
     */
    public boolean checkDate(String date);
    /**
     * Проверка пола человека
     */
    boolean checkGender(String sex);
}
