
import java.util.Scanner;



public class UserInterface {
    private BirdDatabase database;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner){
        this.database = new BirdDatabase();
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String command = scanner.nextLine();
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                this.database.addBird(name, latinName);
            }
            else if(command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                this.database.Observation(name);
            }
            else if(command.equals("All")){
                this.database.printAll();
            }
            else if(command.equals("One")){
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                this.database.printOne(name);
            }
            else if(command.equals("Quit")){
                break;
            }
        }
    }
}
