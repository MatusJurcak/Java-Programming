

public class MainProgram {

    public static void main(String[] args) {
        String stg1 = "tue";
        String stg2 = "queue";
        String stg3 = "2923:05";
        
        Checker checker = new Checker();
        System.out.println(checker.isDayOfWeek(stg1));
        System.out.println(checker.allVowels(stg2));
        System.out.println(checker.timeOfDay(stg3));
 
    }
}
