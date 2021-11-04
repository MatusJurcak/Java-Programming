package buttonandlabel;

import javafx.scene.control.Label;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public void start(Stage window) {
        Button button = new Button("This is a button");
        TextField text = new TextField("Text element");

        FlowPane componentGroup = new FlowPane();
        
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(text);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
}
