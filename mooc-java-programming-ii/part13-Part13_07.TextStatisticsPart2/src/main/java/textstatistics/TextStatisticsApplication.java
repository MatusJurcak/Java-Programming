package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public void start(Stage window) {
        TextArea leftText = new TextArea();
        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");

        leftText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int word = parts.length;
            String longst = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            letters.setText("Letters: " + characters);
            words.setText("Words: " + word);
            longest.setText("The longest word is: " + longst);
        });

        BorderPane box = new BorderPane();
        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(letters, words, longest);

        box.setBottom(componentGroup);
        box.setCenter(leftText);
        Scene scene = new Scene(box);

        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
