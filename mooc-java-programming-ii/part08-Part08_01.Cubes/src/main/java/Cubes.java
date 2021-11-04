
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String idk = scanner.nextLine();
            if(idk.equals("end")){
                break;
            }
            else{
                int number = Integer.valueOf(idk);
                int cube = number * number * number;
                System.out.println(cube);
            }
        }
    }
}
