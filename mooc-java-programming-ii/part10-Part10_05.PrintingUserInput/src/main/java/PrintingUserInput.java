
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        
        while(true){
            String idk = scanner.nextLine();
            if(idk.equals("")){
                break;
            }
            input.add(idk);
        }
        input.stream()
                .forEach(name -> System.out.println(name));
    }
}
