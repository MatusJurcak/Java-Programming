
import java.util.ArrayList;


public class OneItemBox extends Box{
    private ArrayList<Item> box;
    
    public OneItemBox(){
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.box.size() == 0){
            this.box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item itm : box){
            if(itm.equals(item)){
                return true;
            }
        }
        return false;
    }
    
}
