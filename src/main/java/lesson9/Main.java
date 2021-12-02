package lesson9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random machine = new Random();
        Auto[] vehicles = new Auto[] {
                new Car("Bugatti"),
                new Truck("KAMAZ"),
                new Truck("Belaz"),
                new Car("Lada"),
                new Car("Nissan"),
                new Truck("VAZ"),
                new Car("Datsun"),
                new Car("Mercedes"),
                new Car("Cadillac"),
                new Truck("Volvo")
        };
        System.out.println("Автомобили: ");
        for (Auto cars : vehicles) {
            cars.move(machine.nextInt(1000));
        }
    }
}
