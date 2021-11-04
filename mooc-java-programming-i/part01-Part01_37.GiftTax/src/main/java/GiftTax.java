
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double tax = 0;
        if(gift < 5000){
            System.out.println("No tax!");
        } else if(gift < 25000){
            tax = (0.08 * (gift - 5000) + 100);
            System.out.println("Tax: " + tax);
        } else if(gift < 55000){
            tax = (0.1 * (gift - 25000) + 1700);
            System.out.println("Tax: " + tax);
        } else if(gift < 200000){
            tax = (0.12 * (gift - 55000) + 4700);
            System.out.println("Tax: " + tax);
        } else if(gift < 1000000){
            tax = (0.15 * (gift - 200000) + 22100);
            System.out.println("Tax: " + tax);
        } else {
            tax = (0.17 * (gift - 1000000) + 142100);
            System.out.println("Tax: " + tax);
        }
    }
}
