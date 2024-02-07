package com.github.ADyadyk.view.viewMethods;

import com.github.ADyadyk.model.Entry;

import java.util.List;

public interface Viewable {
    /**
     * Метод показывающий меню
     */
    void showMenu();
    /**
     * Метод, добавляющий запись в список записей
     */
    Entry addEntry();

    /**
     * Метод, читающий виртуальную записную книжку
     */
    void virtualRead(List<Entry> entries);
}
