package lesson10;

public enum TempValue {
    ZERO_POINT(-273.15);

    private double value;

    TempValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
