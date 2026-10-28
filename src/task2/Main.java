package task2;

public class Main {
    public static void main(String[] args) {
        // массив из пяти читателей
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров Виктор Васильевич", 1001, "Информатики", "14.03.2005", "+7-900-111-11-11");
        readers[1] = new Reader("Иванова Анна Сергеевна", 1002, "Филологии", "21.07.2004", "+7-900-222-22-22");
        readers[2] = new Reader("Сидоров Павел Олегович", 1003, "Физики", "02.11.2005", "+7-900-333-33-33");
        readers[3] = new Reader("Кузнецова Мария Андреевна", 1004, "Истории", "30.01.2004", "+7-900-444-44-44");
        readers[4] = new Reader("Смирнов Денис Игоревич", 1005, "Математики", "09.09.2005", "+7-900-555-55-55");

        for (int i = 0; i < readers.length; i++) {
            readers[i].printInfo();
        }
        System.out.println();

        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");

        readers[1].takeBook(1);
        readers[1].takeBook("Евгений Онегин");
        readers[2].takeBook(5);
        readers[3].returnBook(2);
        readers[4].returnBook("Война и мир", "Мцыри");
    }
}
