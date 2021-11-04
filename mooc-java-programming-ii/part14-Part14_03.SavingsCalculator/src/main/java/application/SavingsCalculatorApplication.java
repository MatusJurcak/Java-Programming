package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 125000, 25000);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");
        layout.setCenter(lineChart);

        VBox box = new VBox();
        BorderPane first = new BorderPane();
        BorderPane second = new BorderPane();
        Label text1 = new Label("Monthly savings");
        Label text2 = new Label("Yearly interest rate");
        first.setLeft(text1);
        second.setLeft(text2);
        text1.setFont(Font.font("Sans_Serif", 13));
        text2.setFont(Font.font("Sans_Serif", 13));

        Slider slider1 = new Slider();
        first.setCenter(slider1);
        slider1.setMin(25);
        slider1.setMax(250);
        slider1.setValue(0);
        slider1.setShowTickLabels(true);
        slider1.setShowTickMarks(true);
        slider1.setBlockIncrement(25);
        Label txt1 = new Label("" + slider1.getValue());
        first.setRight(txt1);
        ArrayList<Integer> values = new ArrayList<>();
        Map<Integer, Double> values2 = new HashMap<>();
        XYChart.Series data = new XYChart.Series();
        lineChart.getData().add(data);
        slider1.valueProperty().addListener((change, oldValue, newValue) -> {
            txt1.setText("" + round((double) newValue, 2));
            data.getData().clear();
            values.stream().forEach(party -> {
                data.getData().add(new XYChart.Data(party, 1.0 * party * 12 * Double.valueOf(txt1.getText())));
            });
        });
        Slider slider2 = new Slider();
        second.setCenter(slider2);
        slider2.setMin(0);
        slider2.setMax(10);
        slider2.setValue(0);
        slider2.setShowTickMarks(true);
        slider2.setShowTickLabels(true);
        Label txt2 = new Label("" + round(slider2.getValue(), 2));
        second.setRight(txt2);
        for (int i = 0; i <= 30; i++) {
            values.add(i);
            if (i != 0) {
                values2.put(i, (1 + (Double.valueOf(txt2.getText()) / 100)) * (values2.get(i - 1) + (12 * Double.valueOf(txt1.getText()))));
            } else {
                values2.put(i, 1.0 * i);
            }
        }
        values.stream().forEach(party -> {
            data.getData().add(new XYChart.Data(party, 1.0 * party * 12 * Double.valueOf(txt1.getText())));
        });
        XYChart.Series data1 = new XYChart.Series();
        lineChart.getData().add(data1);
        slider2.valueProperty().addListener((change, oldValue, newValue) -> {
            txt2.setText("" + round((double) newValue, 2));
            data1.getData().clear();
            values2.keySet().stream().forEach(party -> {
                if (party != 0) {
                    values2.put(party, (1 + (Double.valueOf(txt2.getText()) / 100)) * (values2.get(party - 1) + (12 * Double.valueOf(txt1.getText()))));
                } else {
                    values2.put(party, 1.0 * party);
                }
                data1.getData().add(new XYChart.Data(party, values2.get(party)));
            });
        });

        box.getChildren().addAll(first, second);
        box.setPadding(new Insets(5, 5, 5, 5));
        first.setPadding(new Insets(10, 10, 10, 10));
        second.setPadding(new Insets(10, 10, 10, 10));
        layout.setTop(box);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
