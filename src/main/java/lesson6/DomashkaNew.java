package lesson6;

import java.util.Scanner;

public class DomashkaNew {

    public static void main(String[] args) {
        int n;
        int number = 2;
        int[] fibonacci = new int[number];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        do {
            System.out.print("Введите номер числа последовательности: "); // введение 0 завершает программу
            n = input();
            while (n < 0) {
                System.out.println("Число не может быть отрицательным!");
                System.out.print("Введите элемент последовательности: ");
                n = input();
            }
            if (n != 0 && n > number) {
                fibonacci = sequenceFibonacci(fibonacci, n);
                System.out.println(fibonacci[n - 1]);
                number = n;
            } else if (n != 0) {
                System.out.println(fibonacci[n - 1]);
            }
        }
        while (n != 0);
    }

    public static int[] sequenceFibonacci(int[] arrayFibonacci, int number) {
        int[] tempArrayFibonacci = new int[number];
        System.arraycopy(arrayFibonacci, 0, tempArrayFibonacci, 0, arrayFibonacci.length);
        for (int i = arrayFibonacci.length; i < number; i++) {
            tempArrayFibonacci[i] = tempArrayFibonacci[i - 1] + tempArrayFibonacci[i - 2];
        }
        System.out.println("Номер массива: " + number);
        return tempArrayFibonacci;
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.print("Введите целое число: ");
            in.next();
        }
        return in.nextInt();
    }
}
