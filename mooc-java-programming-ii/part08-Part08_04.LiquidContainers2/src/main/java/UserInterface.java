
import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.first = new Container();
        this.second = new Container();
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.first.toString());
            System.out.println("Second: " + this.second.toString());
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                this.first.add(amount);
            } else if (command.equals("move")) {
                if (amount > 0) {
                    if (amount > this.first.contains()) {
                        int idk = first.contains();
                        this.first.remove(idk);
                        this.second.add(idk);
                    } else {
                        this.first.remove(amount);
                        this.second.add(amount);
                    }
                }
            } else if (command.equals("remove")) {
                this.second.remove(amount);
            }
        }
    }
}
