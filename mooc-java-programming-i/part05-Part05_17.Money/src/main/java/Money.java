
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int cents = this.cents;
        int euros = this.euros;
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Money)) {
            return false;
        }

        // convert the object to a Bird object
        Money comparedBird = (Money) compared;

        if (this.euros < comparedBird.euros) {
            return true;
        }
        if (this.euros == comparedBird.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int centss = this.cents - decreaser.cents;
        int euross = this.euros - decreaser.euros;
        if (centss < 0) {
            centss = 100 + centss;
            euross--;
        }
        if (euross < 0) {
            Money money = new Money(0, 0);
            return money;
        }
        Money money = new Money(euross, centss);
        return money;
    }
}
