package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage window) {
        Parameters params = getParameters();
        String organization = params.getNamed().get("title");

        window.setTitle(organization);
        window.show();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();

        launch(Main.class,
        "--title=" + title);
    }

}
