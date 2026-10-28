package task4;

// Интерфейс "Пользователь"
public interface User {
    void setLogin(String login);

    String getLogin();

    void setPassword(String password);

    String getPassword();

    boolean checkPassword(String password);
}
