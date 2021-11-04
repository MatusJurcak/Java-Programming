
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            numbers.add(string);
        }
        System.out.println("");
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String posOrNeg = scanner.nextLine();
        if(posOrNeg.equals("p")){
            double average = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else if(posOrNeg.equals("n")){
            double average = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
