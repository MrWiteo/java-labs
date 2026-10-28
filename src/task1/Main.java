package task1;

public class Main {
    public static void main(String[] args) {
        Expression e1 = new Expression(4);
        Expression e2 = new Expression(7, 3);
        Expression e3 = new Expression(6, 2, 2);

        System.out.println("Объект 1 (x = 4)");
        System.out.println("y = 3x + 5 = " + e1.calcLinear());

        System.out.println("Объект 2 (a = 7, b = 3)");
        System.out.println("y = (a+b)/(a-b) = " + e2.calcFraction());

        System.out.println("Объект 3 (a = 6, b = 2, x = 2)");
        System.out.println("y = 3x + 5 = " + e3.calcLinear());
        System.out.println("y = (a+b)/(a-b) = " + e3.calcFraction());
        System.out.println("y = (ax/b)! = " + e3.calcFactorial());

        // проверка деления на ноль
        Expression e4 = new Expression(5, 5, 3);
        System.out.println("Проверка ошибок (a = 5, b = 5, x = 3)");
        e4.calcFraction();
        Expression e5 = new Expression(5, 0, 3);
        e5.calcFactorial();
    }
}
