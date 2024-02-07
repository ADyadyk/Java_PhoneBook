package com.github.ADyadyk.view;

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

    /**
     * Метод, записывающие список записей в файлы по фамильно
     */
    void writeToFile(List<Entry> entries);

    /**
     * Метод, читающий соответствующий файл с записями
     */
    void readEntry(String familyName);


    /**
     * Метод выхода с сохранением
     */
    void saveExit();

    /**
     * Метод выхода без сохранения
     */
    void notSaveExit();
}
