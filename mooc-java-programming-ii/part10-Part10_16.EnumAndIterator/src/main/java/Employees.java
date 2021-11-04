
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.list.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().getDegree().equals(education.getDegree())) {
                System.out.println(nextInLine);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().getDegree().equals(education.getDegree())) {
                iterator.remove();
            }
        }

    }
}
