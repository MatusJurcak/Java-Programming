
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            numbers.add(string);
        }
        double average = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
