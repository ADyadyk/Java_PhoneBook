package com.github.ADyadyk.controller;

import com.github.ADyadyk.model.Entry;
import com.github.ADyadyk.model.repository.backend.impl.BackendMethods;

import java.util.List;

public class NotebookController {
    private BackendMethods BACKEND_METHODS = new BackendMethods();

    public void writeToFileController(List<Entry> entries){
        BACKEND_METHODS.writeToFile(entries);
    }
}
