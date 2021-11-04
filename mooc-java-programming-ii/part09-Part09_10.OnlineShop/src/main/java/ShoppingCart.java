
import java.util.HashMap;
import java.util.Map;



public class ShoppingCart {
    private Map<String, Item> groceries;
    
    public ShoppingCart(){
        this.groceries = new HashMap<>();
    }
            
    public void add(String product, int price){
        if(this.groceries.containsKey(product)){
            this.groceries.get(product).increaseQuantity();
        }
        else{
            this.groceries.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int price = 0;
        for(Item item : groceries.values()){
            price = price + item.price();
        }
        return price;
    }
    
    public void print(){
        for(Item item : groceries.values()){
            System.out.println(item);
        }
    }
}
