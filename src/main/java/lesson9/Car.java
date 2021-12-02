package lesson9;

public class Car extends Auto {
    private String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public final void move(int distance) {
        if (distance >= 500) {
            System.out.println("Автомобиль " + model + " не проедет " + distance + " км");
        } else {
            System.out.println("Автомобиль " + model + " проезжает " + distance + " км");
        }
    }
}
