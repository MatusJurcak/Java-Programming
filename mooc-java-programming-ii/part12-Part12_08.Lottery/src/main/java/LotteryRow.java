
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random idk = new Random();
        this.numbers = new ArrayList<>();
        int i = 0;
        while (i < 7) {
            int number = idk.nextInt(40) + 1;
            if (this.containsNumber(number)) {
                continue;
            }
            this.numbers.add(number);
            i++;
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
