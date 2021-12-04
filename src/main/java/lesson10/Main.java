package lesson10;

public class Main {

    public static void main(String[] args) {
        Temperature water = new Temperature(100, 'C');
        water.showTemperature();
        water.convertCalvin().showTemperature();
        water.convertFahrenheit().showTemperature();

        System.out.println();

        Temperature coffee = new Temperature(173, 'F');
        coffee.showTemperature();
        coffee.convertСelsius().showTemperature();
        coffee.convertCalvin().showTemperature();

        System.out.println();

        Temperature hotChocolate = new Temperature(393, 'K');
        hotChocolate.showTemperature();
        hotChocolate.convertСelsius().showTemperature();
        hotChocolate.convertFahrenheit().showTemperature();

        System.out.println();
    }
}
