
public class Person {

    private String name;
    private String identifier;

    public Person(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;
        
        if (this.identifier.equals(comparedPerson.identifier)) {
            return true;
        }

        return false;
    }
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
