
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            Card nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int compareTo(Hand hand2) {
        Iterator<Card> iterator1 = hand.iterator();
        int sum1 = 0;
        while (iterator1.hasNext()) {
            Card nextInLine = iterator1.next();
            sum1 += nextInLine.getValue();
        }

        Iterator<Card> iterator2 = hand2.hand.iterator();
        int sum2 = 0;
        while (iterator2.hasNext()) {
            Card nextInLine = iterator2.next();
            sum2 += nextInLine.getValue();
        }

        if (sum1 > sum2) {
            return 1;
        } else if (sum2 > sum1) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public void sortBySuit(){
        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(hand, sortBySuitSorter);
    }
}
