package com.github.ADyadyk.view.viewMethods.impl;

import com.github.ADyadyk.model.Entry;
import com.github.ADyadyk.model.repository.myExceptions.MyBirthdayFormatException;
import com.github.ADyadyk.model.repository.myExceptions.MyDataInputException;
import com.github.ADyadyk.model.repository.myExceptions.MyGenderException;
import com.github.ADyadyk.model.repository.myExceptions.MyNumberPhoneException;
import com.github.ADyadyk.view.viewMethods.Promptable;
import com.github.ADyadyk.view.viewMethods.Viewable;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ViewMethods implements Viewable, Promptable {

    @Override
    public void showMenu() {
        System.out.println("Выберите действия с телефонным справочником:");
        System.out.println("1 - добавить запись в виртуальную записную книжку");
        System.out.println("2 - прочитать записи из виртуальной записной книжки");
        System.out.println("3 - записать виртуальную записную книжку по файлам по фамильно");
        System.out.println("4 - прочитать записи из файла по фамилии");
        System.out.println("5 - выйти и сохранить виртуальную записную книжку в файлы");
        System.out.println("6 - выйти и не сохранять виртуальную записную книжку в файлы");
    }

    @Override
    public Entry addEntry() {
        String[] item = requestData();

        // Проверим данные на валидность:
        try {
            if (item.length != 6) throw new MyDataInputException();
            if (!checkPhone(item[4])) throw new MyNumberPhoneException();
            if (!checkDate(item[3])) throw new MyBirthdayFormatException();
            if (!checkGender(item[5])) throw new MyGenderException();

            Entry entry = new Entry.Builder()
                .familyName(item[0])
                .name(item[1])
                .fatherName(item[2])
                .birthday(item[3])
                .telephoneNumber(item[4])
                .sex(item[5])
                .build();


            return entry; // Вернуть с добавлением нового элемента
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Проверка номера телефона
     */
    private boolean checkPhone(String number){
        String regex = "^((\\+7|7|8)+([0-9]){10})$";
        Pattern pattern = Pattern.compile(regex); // Создаём регулярное выражение
        return pattern.matcher(number).matches();
    }
    /**
     * Проверка даты рождения
     */
    private boolean checkDate(String date){
        String regex = "(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.](19|20)\\d\\d";
        Pattern pattern = Pattern.compile(regex); // Создаём регулярное выражение
        return pattern.matcher(date).matches();
    }

    /**
     * Проверка пола человека
     */
    private boolean checkGender(String sex){
        String regex = "(?:m|M|f|F)$";
        Pattern pattern = Pattern.compile(regex); // Создаём регулярное выражение
        return pattern.matcher(sex).matches();
    }

    /**
     * Запрос данных у пользователя
     */
    private String[] requestData(){
        System.out.println("Введите данные для записи в формате:");
        System.out.println();
        System.out.println("Фамилия Имя Отчество Дата_рождения Номер_телефона пол");
        System.out.println();
        System.out.println("Формат ввода:");
        System.out.println("Фамилия, Имя, Отчество - набор символов без пробелов");
        System.out.println("Дата_рождения - dd.mm.gggg (например: 27.12.1985)");
        System.out.println("Номер_телефона - 11 цифр без разделителей " +
                "(например: +79219213141). Только номера России.");
        System.out.println("Пол - один символ обозначающий " +
                "пол человека \"f - женский\" либо \"m - мужской\"");

        String data = promptString("Введите данные для записи в формате: ");
        return data.split("\\s");
    }


    @Override
    public void virtualRead(List<Entry> entries){

    }

    @Override
    public void writeToFile(List<Entry> entries) {

    }

    @Override
    public void readEntry(String familyName) {

    }

    @Override
    public void saveExit() {

    }

    @Override
    public void notSaveExit() {

    }

    @Override
    public String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public int promptInt(String message){
        return Integer.parseInt(promptString(message));
    }
}
