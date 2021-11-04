
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int weight) {
        this.maxWeight = weight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int vaha = suitcase.totalWeight();
        for (Suitcase stc : this.suitcases) {
            vaha = vaha + stc.totalWeight();
        }
        if (!(vaha > this.maxWeight)) {
            this.suitcases.add(suitcase);
        }
    }
    public String toString(){
        int vaha = 0;
        for(Suitcase stc : this.suitcases){
            vaha = vaha + stc.totalWeight();
        }
        return suitcases.size() + " suitcases (" + vaha + " kg)";
    }
    public void printItems(){
        for(Suitcase stc : suitcases){
            stc.printItems();
        }
    }
}
