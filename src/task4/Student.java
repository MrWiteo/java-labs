package task4;

public class Student extends People {
    private String group;

    public Student(String name, String login, String password, String group) {
        super(name, login, password);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void showInfo() {
        System.out.println("Студент: " + name + ", группа: " + group
                + ", логин: " + getLogin() + ", пароль: " + getPassword());
    }
}
