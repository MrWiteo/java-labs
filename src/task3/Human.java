package task3;

public class Human {
    private String name;
    private String surname;
    private int birthYear;

    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public void printInfo() {
        System.out.println("Человек: имя - " + name + ", фамилия - " + surname + ", год рождения - " + birthYear);
    }

    // метод принимает книгу и машину и выводит строку
    public void readBook(Book book, Car car) {
        System.out.println(name + " читает книгу " + book.getTitle() + " про машину " + car.getBrand());
    }
}
