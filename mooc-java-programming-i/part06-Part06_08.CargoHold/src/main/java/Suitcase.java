
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int weight;

    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.weight = weight;
    }

    public void addItem(Item item) {
        int vaha = item.getWeight();
        for (Item itm : items) {
            vaha = vaha + itm.getWeight();
        }
        if (!(vaha > this.weight)) {
            this.items.add(item);
        }
    }

    public String toString() {
        if(this.items.size() == 0){
            return "no items (0 kg)";
        }
        int wg = 0;
        for(Item itm : items){
            wg = wg + itm.getWeight();
        }
        if(this.items.size() == 1){
            return "1 item (" + wg + " kg)";
        }
        return this.items.size() + " items (" + wg + " kg)";
    }
    public void printItems(){
        for(Item itm : items){
            System.out.println(itm);
        }
    }
    public int totalWeight(){
        int vaha = 0;
        for (Item itm : items) {
            vaha = vaha + itm.getWeight();
        }
        return vaha;
    }
    public Item heaviestItem(){
        if(items.size() == 0){
            return null;
        }
        Item item = items.get(0);
        for(Item itm : items){
            if(item.getWeight() < itm.getWeight()){
                item = itm;
            }
        }
        return item;
    }
}
