package task4;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Иванова Мария Петровна", 42, "Доцент", "ivanova", "qwerty123", "Информатика");
        Teacher t2 = new Teacher("Сидоров Олег Иванович", 51, "Профессор", "sidorov", "pass2024", "Математика");
        Student s1 = new Student("Кузнецов Дмитрий Алексеевич", 19, "Староста", "kuznetsov", "dima2005", "ИС-21");
        Student s2 = new Student("Смирнова Анна Павловна", 18, "Студент", "smirnova", "anna_s", "ИС-22");

        t1.printInfo();
        t2.printInfo();
        s1.printInfo();
        s2.printInfo();
        System.out.println();

        System.out.println("Логин t1: " + t1.getLogin());
        System.out.println("Пароль t2 верный? " + t2.checkPassword("pass2024"));
        s1.setLogin("dkuznetsov");
        s1.setPassword("newPass");
        System.out.println("Новый логин s1: " + s1.getLogin() + ", новый пароль: " + s1.getPassword());
        System.out.println("Пароль s2 верный? " + s2.checkPassword("123"));
    }
}
