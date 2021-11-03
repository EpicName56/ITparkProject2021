package lesson2;

public class Test {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        int summa = calculate(14, 2);
        System.out.println(summa);
        int otherSumma = calculate(6, 9);
        System.out.println(otherSumma);
        int yetAnotherSumma = calculate(22, 18);
        System.out.println(yetAnotherSumma);

        long otherMinus = minus(3, 14);
        System.out.println(otherMinus);
    }

    public static int calculate(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
