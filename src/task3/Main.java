package task3;

public class Main {

    // метод, который связывает объекты трёх классов в одну фразу
    public static String makeSentence(Person person, Car car, Book book) {
        return person.getName() + " (" + person.getAge() + " лет) ехал на машине "
                + car.getBrand() + " цвета \"" + car.getColor() + "\" и читал книгу \""
                + book.getTitle() + "\" автора " + book.getAuthor() + ".";
    }

    public static void main(String[] args) {
        Person person = new Person("Алексей", 16);
        Car car = new Car("Toyota", "чёрный", 2015);
        Book book = new Book("Мастер и Маргарита", "Михаил Булгаков", 480);

        person.printInfo();
        car.printInfo();
        book.printInfo();

        System.out.println();
        System.out.println(makeSentence(person, car, book));

        // ещё один набор через конструкторы по умолчанию
        System.out.println();
        System.out.println(makeSentence(new Person(), new Car(), new Book()));
    }
}
