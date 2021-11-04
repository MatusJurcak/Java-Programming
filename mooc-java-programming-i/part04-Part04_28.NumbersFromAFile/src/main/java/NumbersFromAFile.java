
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                int x = Integer.valueOf(scan.nextLine());
                if (x >= lowerBound && x <= upperBound) {
                    numbers.add(x);
                }
            }
        } catch (Exception x) {

        }
        System.out.println("Numbers: " + numbers.size());
    }

}
