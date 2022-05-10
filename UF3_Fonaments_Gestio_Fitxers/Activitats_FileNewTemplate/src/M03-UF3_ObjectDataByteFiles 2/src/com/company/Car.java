package M03;

import java.io.Serializable;

public class Car implements Serializable {
    private final String brand;
    private final String model;
    private final int seats;


    public Car(String brand, String model, int seats) {
        this.brand = brand;
        this.model = model;
        this.seats = seats;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seats=" + seats +
                '}';
    }
}
