package com.github.ADyadyk.model.repository.backend.impl;

import com.github.ADyadyk.model.Entry;
import com.github.ADyadyk.model.repository.backend.BackendMethodable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BackendMethods implements BackendMethodable {
    @Override
    public void writeToFile(List<Entry> entries) {
        for (int i = 0; i < entries.size(); i++) {

            // Все создаваемые файлы будут храниться в папке data. Создадим путь:
            String path = "src/com/github/ADyadyk/data/" + entries.get(i).getFamilyName() + ".txt";

            try(FileWriter fileWriter = new FileWriter(path, true)){
                fileWriter.write(entries.get(i) + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
