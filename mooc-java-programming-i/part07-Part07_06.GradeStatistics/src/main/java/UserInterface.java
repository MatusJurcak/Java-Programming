import java.util.Scanner;

public class UserInterface {
    private Grades listOfGrades;
    
    public UserInterface(){
        this.listOfGrades = new Grades();
    }
    
    public void start(Scanner scanner){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int points = Integer.valueOf(scanner.nextLine());
            if(points == -1){
                break;
            }
            if(points >= 0 && points <= 100){
                this.listOfGrades.addGradeBasedOnPoints(points);
            }
        }
        System.out.println("Point average (all): " + this.listOfGrades.averageOfPoints());
        if(this.listOfGrades.averageOfPointsAbove49() == 0){
            System.out.println("Point average (passing): -");
        } else{
            System.out.println("Point average (passing): " + this.listOfGrades.averageOfPointsAbove49());
        }
        System.out.println("Pass percentage: " + this.listOfGrades.passPercentage());
        printGradeDistribution();
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.listOfGrades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
