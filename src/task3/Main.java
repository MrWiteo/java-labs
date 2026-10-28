package task3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Алексей", "Орлов", 2005);
        Car car = new Car("Тойота", 2015, 1.8);
        Book book = new Book("Заводная машина", "Иван Петров", 2010);

        human.printInfo();
        car.printInfo();
        book.printInfo();

        human.readBook(book, car);
    }
}
