package task4;

public class Student extends People {
    private String group;

    public Student(String fio, int age, String position, String login, String password, String group) {
        super(fio, age, position, login, password);
        this.group = group;
    }

    @Override
    public void printInfo() {
        System.out.println("Студент: " + getFio() + ", возраст: " + getAge() + ", должность: "
                + getPosition() + ", группа: " + group + ", логин: " + getLogin());
    }
}
