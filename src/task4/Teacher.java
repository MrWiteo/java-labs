package task4;

public class Teacher extends People {
    private String subject;

    public Teacher(String name, String login, String password, String subject) {
        super(name, login, password);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void showInfo() {
        System.out.println("Преподаватель: " + name + ", предмет: " + subject
                + ", логин: " + getLogin() + ", пароль: " + getPassword());
    }
}
