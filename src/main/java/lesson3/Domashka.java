package lesson3;

public class Domashka {

    public static void main(String[] args) {
        System.out.println(getTestFact(5) - getTestFact(4));
        System.out.println(getTestFact(5));
        System.out.println(getTestFact(3) + getTestFact(2));
    }

    public static long getTestFact(int f) {
        long result = 1;
        for (int a = 1; a <= f; a++) {
            result = result * a;
        }
        return result;
    }
}
