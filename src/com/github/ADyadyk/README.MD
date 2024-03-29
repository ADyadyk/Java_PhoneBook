**<big>Краткое описание программы JAVA PHONEBOOK</big>**
___
1. При создании программы она была разделена на логические слои.
- view - слой, отвечающий за обработку ввода и вывода данных (simple frontend)
- controller - логический слой, отвечающий за связь view и model
- model - слой отвечающий за обработку данных (simple backend)
2. В папку data программа записывает виртуальную телефонную книгу в файлы, разбивая записи пофамильно.
3. В слое view создан класс View.java, который использует методы из класса FrontendMethods.java. FrontedMethods.java реализует методы из интерфейсов Viewable.java (Ввод и вывод информации в консоль), Checkable.java (валидация данных, вводимых пользователем) и Promptable.java (методы запроса и преобразования вводимой пользователем информации).
4. В слое controller создан класс NotebookController.java, который обеспечивает взаимодействие view и model.
5. В слое model в папке repository представлен интерфейс BackendMethodable.java. Его реализует класс BackendMethods.java, в котором прописана логика записи виртуальной записной книжки в файл пофамильно.
6. В слое model в папке myExceptions представлены исключения разработанные специально для данной программы. 
7. В слое model представлен класс Entry.java, отвечающий за создание отдельной записи в виртуальной записной книжке. При создании экземпляра данного класса используется паттерн Builder.
