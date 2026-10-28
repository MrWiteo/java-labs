package task1;

// Класс для вычисления выражений
public class Expression {
    private double a;
    private double b;
    private double c;

    // конструктор без параметров
    public Expression() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    // конструктор с двумя параметрами
    public Expression(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = 1;
    }

    // конструктор с тремя параметрами
    public Expression(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // сумма a + b + c
    public double sum() {
        return a + b + c;
    }

    // произведение a * b * c
    public double multiply() {
        return a * b * c;
    }

    // выражение (a + b) * c
    public double bracketExpression() {
        return (a + b) * c;
    }

    // дискриминант b^2 - 4ac
    public double discriminant() {
        return b * b - 4 * a * c;
    }

    // среднее арифметическое
    public double average() {
        return (a + b + c) / 3;
    }

    // сложное выражение a^2 + b^2 - c
    public double complexExpression() {
        return Math.pow(a, 2) + Math.pow(b, 2) - c;
    }

    public void printAll() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Сумма: " + sum());
        System.out.println("Произведение: " + multiply());
        System.out.println("(a + b) * c = " + bracketExpression());
        System.out.println("Дискриминант: " + discriminant());
        System.out.println("Среднее: " + average());
        System.out.println("a^2 + b^2 - c = " + complexExpression());
        System.out.println();
    }
}
