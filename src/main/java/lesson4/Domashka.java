package lesson4;

public class Domashka {
    public static int Sqrt(int a) {
        int root = 1;
        while (root * root <= a) root++;
        return --root;
    }

    public static void main(String[] args) {
        System.out.println(Sqrt(255));
    }
}
