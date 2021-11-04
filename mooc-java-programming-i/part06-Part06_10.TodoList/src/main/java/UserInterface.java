import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.list = todoList;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.println("To add:");
                String todo = scanner.nextLine();
                this.list.add(todo);
                continue;
            }
            if(command.equals("list")){
                this.list.print();
                continue;
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int task = Integer.valueOf(scanner.nextLine());
                this.list.remove(task);
                continue;
            }
        }
    }
}
