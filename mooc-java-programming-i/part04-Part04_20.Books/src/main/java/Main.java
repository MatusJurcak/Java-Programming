
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        
        while(true){
            System.out.print("Title:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                System.out.println();
                break;
            }
            System.out.print("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            book.add(new Book(name, pages, year));
        }
        System.out.print("What inforamtion will be printed?");
        String information = scanner.nextLine();
        if(information.equals("everything")){
            for(Book idk : book){
                System.out.println(idk);
            }
        } else if(information.equals("name")){
            for(Book idk : book){
                System.out.println(idk.getTitle());
            }
        }
    }
}
