package com.github.ADyadyk.controller;

import com.github.ADyadyk.model.Entry;
import com.github.ADyadyk.model.repository.check.impl.BackendMethods;

import java.util.List;

public class NotebookController {
    private BackendMethods BACKEND_METHODS = new BackendMethods();

    public void writeToFileController(List<Entry> entries){
        BACKEND_METHODS.writeToFile(entries);
    }

    public void readEntryFromFileController(String familyName){
        BACKEND_METHODS.readEntryFromFile(familyName);
    }

    public void saveToFileAndExitController(){
        BACKEND_METHODS.saveToFileAndExit();
    }

}
