package com.github.ADyadyk.view.viewMethods;

public interface Promptable {
    /**
     * Получение String
     */
    String promptString(String message);
    /**
     * Получение Int
     */
    int promptInt(String message);
}
