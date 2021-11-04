
import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfPoints() {
        double average = -1;
        if (this.points.size() == 0) {
            return -1;
        }
        int counter = 0;
        for (Integer point : points) {
            counter = counter + point;
        }
        average = 1.0 * counter / this.points.size();
        return average;
    }
    public double averageOfPointsAbove49() {
        double average = -1;
        if (this.points.size() == 0) {
            return -1;
        }
        int counter = 0;
        int total = 0;
        for (Integer point : points) {
            if(point >= 50){
                counter++;
                total = total + point;
            }
        }
        if(counter == 0){
            return 0;
        }
        average = 1.0 * total / counter;
        return average;
    }
    public double passPercentage(){
        double percentage = -1;
        if(this.points.size() == 0){
            return -1;
        }
        int counter = 0;
        for(Integer point : points){
            if(point >= 50){
                counter++;
            }
        }
        percentage = 1.0 * 100 * counter / this.points.size();
        return percentage;
    }
}
