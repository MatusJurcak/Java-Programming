
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < list.size(); i++) {
            int number1 = list.get(i);
            if (number1 == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
