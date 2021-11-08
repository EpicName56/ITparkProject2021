package lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        int argument = 1;//-128...-10123...127    -2 ^ 7 .. 2 ^ 7 - 1
        byte errorDigit = (byte) 123;
        byte digit = (byte) (28 + 100);
        System.out.println(errorDigit);


        short anotherDigit = 768;
        int arg = Integer.MAX_VALUE;
        System.out.println(arg);
        long bigValue = 14564165;

        char symbol = 'Я'; // 1071 ... 16 битный 0..2 ^ 16 - 1
        System.out.println(symbol + 1);

        double digitWithPoint = 3.14; // 64 битный
        float floatValue = 100.25F; // 32 битный

        boolean flag = true; // истина
        boolean lie = false; // ложь
        boolean value = 100 == 1_000_000;
        boolean notValue = !value;
        boolean trueValue = true != false; // не рекомендуется
        boolean complexAnd = (100 == 100) & (125 == 125); // true = true & true
        boolean complexOr = (100 == 99) | (125 == 129); // false = false | false

        if (value) {
            System.out.println("Переменная value истинна");
        } else {
            System.out.println("Переменная value ложна");
        }
    }
}
