public class Book {
    private String name;
    private int ageRestriction;

    public Book(String name, int releaseYear) {
        this.name = name;
        this.ageRestriction = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRestriction() {
        return this.ageRestriction;
    }

    public String toString() {
        return this.name + " (recommended for " + this.ageRestriction + " year-olds or older)";
    }
}
