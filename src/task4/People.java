package task4;

// Абстрактный класс People, реализует интерфейс User
public abstract class People implements User {
    private String fio;
    private int age;
    private String position;
    private String login;
    private String password;

    public People(String fio, int age, String position, String login, String password) {
        this.fio = fio;
        this.age = age;
        this.position = position;
        this.login = login;
        this.password = password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    // каждый наследник выводит информацию по-своему
    public abstract void printInfo();
}
