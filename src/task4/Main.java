package task4;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Иванова Мария Петровна", "ivanova", "qwerty123", "Информатика");
        Teacher t2 = new Teacher("Сидоров Олег Иванович", "sidorov", "pass2024", "Математика");

        Student s1 = new Student("Кузнецов Дмитрий", "kuznetsov", "dima2008", "10А");
        Student s2 = new Student("Смирнова Анна", "smirnova", "anna_s", "10Б");

        t1.showInfo();
        t2.showInfo();
        s1.showInfo();
        s2.showInfo();

        // проверяем методы интерфейса
        System.out.println();
        System.out.println("Логин первого студента: " + s1.getLogin());
        s1.setPassword("newPassword");
        System.out.println("Новый пароль первого студента: " + s1.getPassword());

        // работа через интерфейс
        User user = t2;
        System.out.println("Логин через интерфейс User: " + user.getLogin());
    }
}
