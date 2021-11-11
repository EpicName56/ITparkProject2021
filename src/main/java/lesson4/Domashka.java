package lesson4;

public class Domashka {

    public static void main(String[] args) {
        {
            int value = 0;
            int a = 1;
            int result = 225;
            while (a <= result) {
                result -= a;
                a += 2;
                result += 1;
            }
            System.out.println(result);
        }
    }
}