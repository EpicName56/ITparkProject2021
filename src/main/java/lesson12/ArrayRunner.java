package lesson12;

public class ArrayRunner {

    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "1", "2", "3"},
                {"4", "5", "6", "7"}
        };

        ArraysValue arraysSum = new ArraysValue(array);
        try {
            System.out.println(arraysSum.sum());
        } catch (MyArraySizeExeption e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
