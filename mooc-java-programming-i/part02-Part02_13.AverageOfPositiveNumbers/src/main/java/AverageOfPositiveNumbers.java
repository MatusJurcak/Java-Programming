
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                counter++;
                sum = sum + number;
                continue;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0 * sum / counter;
            System.out.println(average);
        }
    }
}
