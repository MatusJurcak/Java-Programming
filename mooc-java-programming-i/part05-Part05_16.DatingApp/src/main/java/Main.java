
public class Main {

    public static void main(String[] args) {
        
        int day = 30;
        int month = 12;
        int year = 1999;
        
        SimpleDate date = new SimpleDate(day, month, year);
        System.out.println(date);
        date.advance();
        System.out.println(date);
        date.advance(360);
        System.out.println(date);
    }
}
