package com.github.ADyadyk.model.repository.backend;

import com.github.ADyadyk.model.Entry;

import java.util.List;

public interface BackendMethodable {
    /**
     * Метод, записывающие список записей в файлы пофамильно
     */
    void writeToFile(List<Entry> entries);
}
