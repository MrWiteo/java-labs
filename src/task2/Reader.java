package task2;

// Класс читателя библиотеки
public class Reader {
    private String fio;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fio, int ticketNumber, String faculty, String birthDate, String phone) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    // 1 вариант: просто количество книг
    public void takeBook(int count) {
        System.out.println(fio + " взял(а) " + count + " книги(книг)");
    }

    // 2 вариант: названия книг через запятую (сколько угодно)
    public void takeBook(String... titles) {
        System.out.print(fio + " взял(а) книги: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i]);
            if (i != titles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // 3 вариант: автор, название и год издания
    public void takeBook(String author, String title, int year) {
        System.out.println(fio + " взял(а) книгу: " + author + " - " + title + " (" + year + " г.)");
    }

    // возврат: просто количество
    public void returnBook(int count) {
        System.out.println(fio + " вернул(а) " + count + " книги(книг)");
    }

    // возврат: названия
    public void returnBook(String... titles) {
        System.out.print(fio + " вернул(а) книги: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i]);
            if (i != titles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // возврат: автор, название, год
    public void returnBook(String author, String title, int year) {
        System.out.println(fio + " вернул(а) книгу: " + author + " - " + title + " (" + year + " г.)");
    }

    public void printInfo() {
        System.out.println("Читатель: " + fio + ", билет №" + ticketNumber
                + ", факультет: " + faculty + ", дата рождения: " + birthDate
                + ", телефон: " + phone);
    }
}
