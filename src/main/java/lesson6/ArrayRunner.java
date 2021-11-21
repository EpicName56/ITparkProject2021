package lesson6;

public class ArrayRunner {

    public static void main(String[] args) {
        char[] symbols = new char[10];
        symbols[0] = '\u0000'; //0
        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i]);
        }
    }
}
