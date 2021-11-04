
import java.util.ArrayList;


public class Hideout<T> {
    private ArrayList<T> elements;
    
    public Hideout(){
        this.elements = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if(elements.isEmpty()){
            this.elements.add(toHide);
        } else{
            this.elements.clear();
            this.elements.add(toHide);
        }
    }
    
    public T takeFromHideout(){
        T element = elements.get(0);
        this.elements.clear();
        return element;
    }
    
    public boolean isInHideout(){
        if(this.elements.isEmpty()){
            return false;
        }
        return true;
    }
}
