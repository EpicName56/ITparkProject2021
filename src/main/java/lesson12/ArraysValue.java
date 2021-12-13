package lesson12;

public class ArraysValue {
    public String[][] array;

    private void checkArray() {
        if (array.length != 4) throw new MyArraySizeException("Ошибка, массивов не четыре, а " + array.length);

        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Ошибка, в массиве " + i +
                        " не четыре значения, а " + array[i].length);
            }
        }
    }

    public int sum() {
        checkArray();
        int sum = 0;
        for (int a = 0; a < 4; a++) {
            for (int i = 0; i < 4; i++) {
                try {
                    sum = sum + Integer.parseInt(array[a][i]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В массиве " + a + " в ячейке " + i + " символ "
                            + array[a][i] + " вместо числа");
                }
            }
        }
        return sum;
    }

    public ArraysValue(String[][] array) {
        this.array = array;
    }
}
