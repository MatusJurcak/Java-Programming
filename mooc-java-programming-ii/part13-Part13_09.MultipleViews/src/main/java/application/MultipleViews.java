package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window) {
        BorderPane box1 = new BorderPane();
        Label text1 = new Label("First view!");
        Button first = new Button("To the second view!");
        box1.setTop(text1);
        box1.setCenter(first);

        VBox box2 = new VBox();
        Label text2 = new Label("Second view!");
        Button second = new Button("To the third view!");
        box2.getChildren().addAll(second, text2);
        
        GridPane box3 = new GridPane();
        Label text3 = new Label("Third view!");
        Button third = new Button("To the first view!");
        box3.add(text3, 0, 0);
        box3.add(third, 1, 1);
        
        
        Scene scene1 = new Scene(box1);
        Scene scene2 = new Scene(box2);
        Scene scene3 = new Scene(box3);
        
        first.setOnAction((event) -> {
           window.setScene(scene2);
        });
        
        second.setOnAction((event) -> {
            window.setScene(scene3);
        });
        
        third.setOnAction((event) -> {
            window.setScene(scene1);
        });
        
        window.setScene(scene1);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
