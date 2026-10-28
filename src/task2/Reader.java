package task2;

// Читатель библиотеки
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

    // делает из "Петров Василий Витальевич" строку "Петров В. В."
    private String shortName() {
        String[] parts = fio.split(" ");
        String result = parts[0];
        for (int i = 1; i < parts.length; i++) {
            result = result + " " + parts[i].charAt(0) + ".";
        }
        return result;
    }

    // подбирает слово "книга", "книги" или "книг"
    private String bookWord(int count) {
        int last = count % 10;
        int lastTwo = count % 100;
        if (lastTwo >= 11 && lastTwo <= 14) {
            return "книг";
        }
        if (last == 1) {
            return "книгу";
        }
        if (last >= 2 && last <= 4) {
            return "книги";
        }
        return "книг";
    }

    // взял указанное количество книг
    public void takeBook(int count) {
        System.out.println(shortName() + " взял " + count + " " + bookWord(count));
    }

    // взял книги с названиями (сколько угодно названий)
    public void takeBook(String... titles) {
        String list = "";
        for (int i = 0; i < titles.length; i++) {
            list = list + titles[i];
            if (i < titles.length - 1) {
                list = list + ", ";
            }
        }
        System.out.println(shortName() + " взял книги: " + list);
    }

    // вернул указанное количество книг
    public void returnBook(int count) {
        System.out.println(shortName() + " вернул " + count + " " + bookWord(count));
    }

    // вернул книги с названиями
    public void returnBook(String... titles) {
        String list = "";
        for (int i = 0; i < titles.length; i++) {
            list = list + titles[i];
            if (i < titles.length - 1) {
                list = list + ", ";
            }
        }
        System.out.println(shortName() + " вернул книги: " + list);
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio + ", билет №" + ticketNumber + ", факультет: " + faculty
                + ", дата рождения: " + birthDate + ", телефон: " + phone);
    }
}
