
import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    
    public UserInterface(){
        this.first = new Container();
        this.second = new Container();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("remove")) {
                this.second.remove(amount);
            }
            if (command.equals("add")) {
                this.first.add(amount);
            }
            if (command.equals("move")) {
                if (amount > this.first.contains()) {
                    amount = this.first.contains();
                }
                this.first.remove(amount);
                this.second.add(amount);
            }
        }

    }
}
