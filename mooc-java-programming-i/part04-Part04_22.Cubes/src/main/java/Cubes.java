
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String idk = scanner.nextLine();
            if(idk.equals("end")){
                break;
            }
            int nwm = Integer.valueOf(idk);
            System.out.println(nwm * nwm * nwm);
        }
    }
}
