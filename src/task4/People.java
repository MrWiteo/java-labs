package task4;

// Абстрактный класс People
public abstract class People implements User {
    protected String name;
    private String login;
    private String password;

    public People(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    // этот метод обязаны реализовать наследники
    public abstract void showInfo();
}
