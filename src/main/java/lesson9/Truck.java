package lesson9;

public class Truck extends Auto {
    private String model;

    Truck (String model) {
        this.model = model;
    }

    @Override
    public final void move (int distance) {
        if (distance >= 1200) {
            System.out.println("Грузовик " + model + " не проедет " + distance + " км");
        } else {
            System.out.println("Грузовик " + model + " проезжает " + distance + " км");
        }
    }
}
