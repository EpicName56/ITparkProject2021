package lesson5;

public class FibTest {

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println();
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        System.out.println("Член последовательности с номером 5 - " +
                "это 6 число в последовательности Фибоначчи");
    }
}
