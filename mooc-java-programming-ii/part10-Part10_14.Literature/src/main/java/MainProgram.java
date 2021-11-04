
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                System.out.print("Input the age recommendation: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                books.add(new Book(input, age));
            }
        }
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRestriction)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println("");
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
