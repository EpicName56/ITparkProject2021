package lesson5;

import java.util.Scanner;

public class FibTest {

    public static void main(String[] args) {
        int n = 11;
        int a = 1, b = 1;

        System.out.println(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;

            System.out.println(" " + fib);
            i++;
        }
    }
}
