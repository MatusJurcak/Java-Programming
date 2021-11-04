
import java.util.ArrayList;


public class Herd implements Movable{
    private ArrayList<Movable> herb;
    
    public Herd(){
        this.herb = new ArrayList<>();
    }
    
    public String toString(){
        String stg = "";
        for(Movable idk : herb){
            stg = stg + idk + "\n";
        }
        return stg;
    }
    
    public void addToHerd(Movable movable){
        this.herb.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable idk : herb){
            idk.move(dx, dy);
        }
    }
}
