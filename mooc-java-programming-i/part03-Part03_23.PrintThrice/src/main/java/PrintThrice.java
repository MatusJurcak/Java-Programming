
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String idk = scanner.nextLine();
        idk = idk + idk + idk;
        System.out.println(idk);
    }
}
