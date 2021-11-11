package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionOfSphetaphore("жёлтый"));
        System.out.println(getSolutionOfSphetaphore("зеленый"));
        System.out.println(getSolutionOfSphetaphore("красный"));
    }

    public static String getSolutionOfSphetaphore(String color) {
        switch (color) {
            case "красный": {
                return "Проход запрещен";
            }
            case "жёлтый": {
                return "Будь внимателен";
            }
            case "зеленый": {
                return "Проход разрешен";
            }
            default: {
                return "";
            }
        }
    }
}
