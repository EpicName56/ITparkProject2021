package lesson4;

public class DomashkaNew {

    public static void main(String[] args) {
        System.out.println(testSqrt(81));
    }

    public static int testSqrt(int a) {
        int root = 1;
        while (root * root <= a) root++;
        return --root;
    }
}