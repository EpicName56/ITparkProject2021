package lesson10;

public record Temperature(double temperatureValue, char unitValue) implements Convert {

    public Temperature(double temperatureValue, char unitValue) {
        this.temperatureValue = temperatureValue;
        if (unitValue == 'C' | unitValue == 'F' | unitValue == 'K') {
            this.unitValue = unitValue;
        } else {
            this.unitValue = 'C';
        }
    }

    public void showTemperature() {
        System.out.println("Температура на данный момент: " + temperatureValue + " " + unitValue);
    }

    @Override
    public Temperature convertСelsius() {
        double newValue = 0;
        char newMeasure = 'C';
        double tempConst = Math.abs(TempValue.ZERO_POINT.getValue());
        System.out.println("Температура по Цельсию: ");
        if (unitValue == 'C') {
            return new Temperature(temperatureValue, unitValue);
        } else {
            if (unitValue == 'K') {
                newValue = temperatureValue - tempConst;
                newMeasure = 'C';
            }
            if (unitValue == 'F') {
                newValue = (temperatureValue - 32) * 5 / 9;
                newMeasure = 'C';
            }
        }
        return new Temperature(newValue, newMeasure);
    }

    @Override
    public Temperature convertFahrenheit() {
        System.out.println("Температура по Фаренгейту: ");
        double newValue = 0;
        char newMeasure = 'C';
        double tempConst = Math.abs(TempValue.ZERO_POINT.getValue());
        if (unitValue == 'F') {
            return new Temperature(temperatureValue, unitValue);
        } else {
            if (unitValue == 'C') {
                newValue = (temperatureValue * 9 / 5) + 32;
                newMeasure = 'F';
            }
            if (unitValue == 'K') {
                newValue = (temperatureValue - tempConst) * 9 / 5 + 32;
                newMeasure = 'F';
            }
        }
        return new Temperature(newValue, newMeasure);
    }

    @Override
    public Temperature convertCalvin() {
        double newValue = 0;
        char newMeasure = 'C';
        double tempConst = Math.abs(TempValue.ZERO_POINT.getValue());
        System.out.println("Температура по Кельвину: ");
        if (unitValue == 'K') {
            return new Temperature(temperatureValue, unitValue);
        } else {
            if (unitValue == 'C') {
                newValue = temperatureValue + tempConst;
                newMeasure = 'K';
            }
            if (unitValue == 'F') {
                newValue = (temperatureValue - 32) * 5 / 9 + 273.15;
                newMeasure = 'K';
            }
        }
        return new Temperature(newValue, newMeasure);
    }
}
