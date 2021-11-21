package lesson6;

import java.util.Scanner;

public class Domashka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // необходима для ввода пользователем значения в консоль
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < fib.length; ++i) {
            System.out.println(fib[i]);
        }
    }
}
