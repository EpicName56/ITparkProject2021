package lesson3;

public class Domashka {

    public static void main(String[] args) {
        System.out.println(getTestFact(5) - getTestFact(4));
    }
    public static int getTestFact(int f) {
        int result = 1;
        for (int a=1; a <= f; a++) {
            result = result * a;
        }
        return result;
    }
}
