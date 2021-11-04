
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> rate = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> {
                        if (Double.valueOf(p1[5]) - Double.valueOf(p2[5]) == 0) {
                            return 0;
                        } else if (Double.valueOf(p1[5]) - Double.valueOf(p2[5]) > 0) {
                            return 1;
                        } else {
                            return -1;
                        }

                    })
                    .map(parts -> parts[3] + " (" + parts[4] + ")," + parts[2].substring(0, parts[2].length() - 4) + ", " + parts[5])
                    .forEach(value -> rate.add(value));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (String idk : rate) {
            System.out.println(idk);
        }
    }
}
