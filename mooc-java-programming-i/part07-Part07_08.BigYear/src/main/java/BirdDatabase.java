
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> register;

    public BirdDatabase() {
        this.register = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        if (!(this.register.contains(new Bird(name, latinName)))) {
            this.register.add(new Bird(name, latinName));
        }
    }

    public boolean contain(String name) {
        for (Bird bird : register) {
            String name2 = bird.getName();
            if (name.equals(name2)) {
                return true;
            }
        }
        return false;
    }

    public void Observation(String name) {
        if (this.contain(name)) {
            for (Bird bird : register) {
                if (name.equals(bird.getName())) {
                    bird.addObservation();
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        for (Bird bird : register) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name){
        if(this.contain(name)){
            for(Bird bird : register){
                 if(name.equals(bird.getName())){
                     System.out.println(bird);
                 }
            }
        }
        else{
            System.out.println("Not a bird!");
        }
    }
}
