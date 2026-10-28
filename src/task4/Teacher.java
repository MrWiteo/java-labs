package task4;

public class Teacher extends People {
    private String subject;

    public Teacher(String fio, int age, String position, String login, String password, String subject) {
        super(fio, age, position, login, password);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        System.out.println("Преподаватель: " + getFio() + ", возраст: " + getAge() + ", должность: "
                + getPosition() + ", предмет: " + subject + ", логин: " + getLogin());
    }
}
