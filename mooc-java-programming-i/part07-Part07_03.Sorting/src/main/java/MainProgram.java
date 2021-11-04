
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int number = MainProgram.smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int number = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < number) {
                index = i;
                number = table[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int idk = array[index1];
        array[index1] = array[index2];
        array[index2] = idk;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfSmallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, indexOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
