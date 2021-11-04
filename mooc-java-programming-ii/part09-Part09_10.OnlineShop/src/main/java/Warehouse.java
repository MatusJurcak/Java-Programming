
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        if (this.stockBalance.containsKey(product)) {
            stock = stock + this.stockBalance.get(product);
            this.stockBalance.put(product, stock);
        } else {
            this.stockBalance.put(product, stock);
        }
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.stockBalance.containsKey(product)){
            return this.stockBalance.get(product);
        }
        else{
            return 0;
        }
    }
    
    public boolean take(String product){
        if(this.stockBalance.containsKey(product)){
            if(this.stock(product) > 0){
                int idk = -1 + this.stock(product);
                if(idk == 0){
                    this.stockBalance.remove(product);
                    return true;
                }
                this.stockBalance.remove(product);
                this.stockBalance.put(product, idk);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for(String idk : this.stockBalance.keySet()){
            products.add(idk);
        }
        return products;
    }
}
