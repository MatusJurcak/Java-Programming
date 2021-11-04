
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        this.day = this.day + howManyDays;
        if (this.day > 30) {
            int idk = (this.day / 30);
            this.day = this.day - (this.day / 30) * 30;
            this.month = this.month + idk;
            if (this.month > 12) {
                idk = (this.month / 12);
                this.month = this.month - (this.month / 12) * 12;
                this.year = this.year + idk;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        int day = this.day;
        int month = this.month;
        int year = this.year;
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        
        return newDate;
    }
}
