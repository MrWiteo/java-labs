package task1;

public class Main {
    public static void main(String[] args) {
        // создаём 3 объекта разными конструкторами
        Expression e1 = new Expression();
        Expression e2 = new Expression(4, 7);
        Expression e3 = new Expression(2, -5, 3);

        System.out.println("Объект 1 (конструктор по умолчанию):");
        e1.printAll();

        System.out.println("Объект 2 (два параметра):");
        e2.printAll();

        System.out.println("Объект 3 (три параметра):");
        e3.printAll();

        // обращаемся к методам напрямую
        System.out.println("Сумма третьего объекта = " + e3.sum());
        System.out.println("Произведение второго объекта = " + e2.multiply());
    }
}
