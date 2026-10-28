package task3;

public class Car {
    private String brand;
    private int year;
    private double engineVolume;

    public Car(String brand, int year, double engineVolume) {
        this.brand = brand;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("Автомобиль: марка - " + brand + ", год выпуска - " + year
                + ", объем двигателя - " + engineVolume + " л");
    }
}
