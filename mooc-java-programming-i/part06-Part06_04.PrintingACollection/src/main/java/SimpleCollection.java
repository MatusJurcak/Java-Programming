
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String printOutput = "The collection " + this.name + " ";

        if (elements.isEmpty()) {
            return printOutput + "is empty.";
        }

        // we form a string from the people on the list
        String peopleOnRide = "";

        for (int i = 0; i < elements.size(); i++) {
            String letter = elements.get(i);
            if(i == elements.size() - 1){
                peopleOnRide = peopleOnRide + letter;
                continue;
            }
            peopleOnRide = peopleOnRide + letter + "\n";
        }
        if (this.elements.size() == 1) {
            return printOutput + "has " + this.elements.size() + " element:\n" + peopleOnRide;
        }

        return printOutput + "has " + this.elements.size() + " elements:\n" + peopleOnRide;
    }

}
