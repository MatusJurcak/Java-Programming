
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String name = "";
        int sum = 0;
        int counter = 0;
        while (true) {
            String udaje = scanner.nextLine();
            if (udaje.equals("")) {
                break;
            }
            String[] pieces = udaje.split(",");
            if (pieces[0].length() > length) {
                name = pieces[0];
                length = pieces[0].length();
            }
            sum = sum + Integer.valueOf(pieces[1]);
            counter++;
        }
        double avg = 1.0 * sum/counter;
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + avg);
    }
}
