package notifier;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public void start(Stage window) {
        TextField topMostText = new TextField();
        Label bottomText = new Label();
        Button middlebutton = new Button("Update");

        middlebutton.setOnAction((event) -> {
            bottomText.setText(topMostText.getText());
        });

        topMostText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            bottomText.setText(longest);
        });

        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(topMostText, middlebutton, bottomText);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
