
import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> box;
    private double maxCapacity;

    public Box(double weight) {
        this.maxCapacity = weight;
        this.box = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable idk : box) {
            weight = weight + idk.weight();
        }
        return weight;
    }

    public void add(Packable object) {
        double weight = this.weight();
        if (weight + object.weight() <= this.maxCapacity) {
            this.box.add(object);
        }
    }

    public String toString() {
        double weight = this.weight();
        return "Box: " + this.box.size() + " items, total weight " + weight + " kg";
    }
}
