package task3;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Неизвестный";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Человек: " + name + ", возраст: " + age);
    }
}
