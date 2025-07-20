package chapter4_controlStructures;

public class ExFibonachi {
    public static void main(String[] args) {
        getFibonachi(7);
    }

    public static void getFibonachi(int count) {
        int[] array = new int[count];
        array[0] = 1;
        array[1] = 1;

        for (int i = 0; i < count - 2; i++) {
            array[i + 2] = array[i] + array[i + 1];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
