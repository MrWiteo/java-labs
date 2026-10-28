# Лабораторные работы по Java

Четыре задания по ООП. Каждое задание лежит в своём пакете в папке `src`.

- `task1` - класс `Expression`: y=3x+5, y=(a+b)/(a-b), y=(ax/b)! с проверкой деления на ноль
- `task2` - класс `Reader` (массив из 5 объектов), перегрузка методов `takeBook()` и `returnBook()`
- `task3` - классы `Human`, `Car`, `Book`, метод `readBook()` выводит общую фразу
- `task4` - интерфейс `User`, абстрактный класс `People`, наследники `Teacher` и `Student`

## Запуск

```
javac -d out src/task1/*.java
java -cp out task1.Main
```

Для других заданий нужно заменить `task1` на `task2`, `task3` или `task4`.
