package task1;

// Класс для вычисления трёх выражений
public class Expression {
    private double a;
    private double b;
    private double x;

    // конструктор только с x (для y = 3x + 5)
    public Expression(double x) {
        this.x = x;
        this.a = 1;
        this.b = 1;
    }

    // конструктор с a и b (для y = (a+b)/(a-b))
    public Expression(double a, double b) {
        this.a = a;
        this.b = b;
        this.x = 1;
    }

    // конструктор со всеми параметрами (для y = (ax/b)!)
    public Expression(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    // 1) y = 3x + 5
    public double calcLinear() {
        return 3 * x + 5;
    }

    // 2) y = (a + b) / (a - b)
    public double calcFraction() {
        if (a - b == 0) {
            System.out.println("Ошибка: деление на ноль (a равно b)");
            return Double.NaN;
        }
        return (a + b) / (a - b);
    }

    // 3) y = (a * x / b)!
    public double calcFactorial() {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль (b равно 0)");
            return Double.NaN;
        }
        double value = a * x / b;
        // факториал есть только у целых неотрицательных чисел
        if (value < 0 || value != Math.floor(value)) {
            System.out.println("Ошибка: факториал не существует для числа " + value);
            return Double.NaN;
        }
        if (value > 170) {
            System.out.println("Ошибка: слишком большое число для факториала");
            return Double.NaN;
        }
        double result = 1;
        for (int i = 2; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}
