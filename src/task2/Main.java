package task2;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров Василий Николаевич", 1234, "Информатики", "12.05.2008", "+7-900-123-45-67");
        reader.printInfo();
        System.out.println();

        // берём книги разными способами
        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader.takeBook("Пушкин", "Капитанская дочка", 1836);

        System.out.println();

        // возвращаем книги разными способами
        reader.returnBook(2);
        reader.returnBook("Приключения", "Словарь");
        reader.returnBook("Пушкин", "Капитанская дочка", 1836);
    }
}
