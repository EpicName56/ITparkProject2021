package lesson5;

import java.util.Scanner;

public class FibTest {

    public static void main(String[] args) {
        int[] arr = new int[6]; // ввод верхнего номера числа для расчета
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println();
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
