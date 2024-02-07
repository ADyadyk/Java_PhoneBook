package com.github.ADyadyk.view;

import com.github.ADyadyk.controller.NotebookController;
import com.github.ADyadyk.model.Entry;
import com.github.ADyadyk.view.viewMethods.impl.FrontendMethods;

import java.util.ArrayList;
import java.util.List;

public class View {
    private static final FrontendMethods FRONTEND_METHODS = new FrontendMethods();
    private static final NotebookController CONTROLLER = new NotebookController();
    public static void run(){
        // Создание виртуальной записной книжки
        List<Entry> virtualPhoneBook = new ArrayList<>();

        while (true){
            FRONTEND_METHODS.showMenu();
            int menuItem = FRONTEND_METHODS.promptInt("Выберите пункт меню: ");

            // Добавление записи в виртуальную записную книжку
            if (menuItem == 1){
                Entry temp = FRONTEND_METHODS.addEntry();

                // Проверка на то, что из метода вернулись валидные данные:
                if (temp != null){
                    virtualPhoneBook.add(temp);
                }

                // Вывод в консоль изменений в виртуальной записной книжке:
                System.out.println();
                FRONTEND_METHODS.virtualRead(virtualPhoneBook);
            }

            // Вывод в консоль виртуальной записной книжки
            if (menuItem == 2){
                System.out.println();
                FRONTEND_METHODS.virtualRead(virtualPhoneBook);
                System.out.println();
            }

            // Запись виртуальной записной книжки по фамильно в файлы
            if (menuItem == 3){

            }

            // Вывод в консоль из файла по фамилии
            if (menuItem == 4){

            }

            // Выход с сохранением виртуальной записной книжки по фамильно в файлы
            if (menuItem == 5){

            }

            // Выход без сохранения виртуальной записной книжки
            if (menuItem == 6){
                return;
            }
        }
    }
}
