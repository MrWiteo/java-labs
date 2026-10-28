package task3;

public class Car {
    private String brand;
    private String color;
    private int year;

    public Car() {
        this.brand = "Лада";
        this.color = "белый";
        this.year = 2000;
    }

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void printInfo() {
        System.out.println("Автомобиль: " + brand + ", цвет: " + color + ", год: " + year);
    }
}
