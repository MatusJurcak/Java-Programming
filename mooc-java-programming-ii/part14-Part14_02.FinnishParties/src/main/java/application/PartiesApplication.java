package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of parties");

        ArrayList<Integer> years = new ArrayList<>();
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        try ( Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            int i = 0;
            while (scanner.hasNextLine()) {
                if (i == 0) {
                    String row = scanner.nextLine();
                    String[] pieces = row.split("\t");
                    for (int k = 1; k < pieces.length; ++k) {
                        years.add(Integer.valueOf(pieces[k]));
                    }
                    i++;
                } else {
                    String row = scanner.nextLine();
                    String[] pieces = row.split("\t");
                    Map<Integer, Double> data = new HashMap<>();
                    for (int k = 1; k < pieces.length; ++k) {
                        if (!(pieces[k].equals("-"))) {
                            data.put(years.get(k - 1), Double.valueOf(pieces[k]));
                        }
                    }
                    values.put(pieces[0], data);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
