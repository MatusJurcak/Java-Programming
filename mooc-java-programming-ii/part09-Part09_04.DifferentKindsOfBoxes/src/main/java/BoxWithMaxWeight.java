import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int maxCapacity;
    
    public BoxWithMaxWeight(int capacity){
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for(Item itm : items){
            totalWeight = totalWeight + itm.getWeight();
        }
        if((item.getWeight() + totalWeight) <= this.maxCapacity){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item itm : items){
            if(itm.equals(item)){
                return true;
            }
        }
        return false;
    }
    
}
