# Все задания про кошек связаны между собой и их следует выполнить в одном проекте.

# Урок 1. Понятие класса и объекта

    Создать 5-7 кошек и вызвать у них различные методы:

     * напечатайте в консоль вес созданных кошек
     * покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
     * перекормите кошку
     * "замяукайте" кошку до смерти

    Рекомендации: для достижения “перекорма” и “замяукивания” кошки возможно использовать цикл с условием проверки статуса кошки, чтобы лишнего не мяукать и не кормить


# Урок 2. Метод, параметры, return

    Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
    Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.

    Рекомендации: протестируйте верную работу метода возврата съеденной еды:

     * создайте кошку 
     * покормите кошку кормом весом 150.00
     * вызовите метод pee() несколько раз
     * распечатайте значение съеденного корма, в консоль должно напечататься 150.00


# Урок 3. Статические методы и переменные

    Создать у класса Cat статическую переменную count, которая будет увеличиваться, если кошку создали, и убывать, если кошка взорвалась или умерла
    Создать статический метод getCount(), который будет возвращать количество кошек

Задание c звездочкой:
 
    придумайте способ проверять жива ли кошка или нет на основе значения ее веса, и используя это запретите кормить, пить, ходить в туалет неживой кошке.


# Урок 4. Константы и Enum

    Создать у кошки константы: “количество глаз”, “минимальный вес” и “максимальный вес”.
    Создать enum с окрасами кошек.


 # Урок 5. Создание объектов и конструктор

    Создать в классе Cat ещё один конструктор так, чтобы можно было создать кошку с весом переданным в конструктор
    Создать в главном классе Loader метод генерации котенка private static Cat getKitten(), который будет возвращать кошку с весом 1100.00, используя конструктор в который передаем вес кошки, как описано в видеоуроке.

 

# Урок 6. Инкапсуляция, геттеры и сеттеры

    В классе Car проекта RoadController создать геттеры и сеттеры для всех переменных класса.
    Создать у кошки переменную в которой хранится окрас, написать геттер и сеттер для окраса.

    Рекомендации: имена методов, возвращающие значения полей типа boolean, принято именовать с префиксами is/has. Например:

    метод возвращающий результат проверки “Жива ли кошка?” можно назвать isAlive(), если кошка жива - мы ожидаем возврат значение true
    метод возвращающий результат проверки “Есть ли у кошки хвост?” можно назвать hasTail(), если кошка с хвостом - мы ожидаем возврат значение true


# Урок 7. Копирование объектов

    Создать у кошки метод создания её “глубокой” копии. Для создания копии кошки вы можете использовать метод копирования или конструктор копирования.
 

# Урок 8. Внешние библиотеки классов

    Повторить действия, выполненные в видео:
    — создать новый проект
    — подключить к нему библиотеку airport.jar
    — получить список самолетов
    — распечатать количество (число) самолётов в аэропорту.


# Урок 9. Создание JAR-файлов

    Упаковать приложение с экспериментами над кошками в JAR-файл, запустить и проверить, что он запускается.