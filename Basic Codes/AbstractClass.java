//Abstract class is almost same as Interface, few differences are there in notes

abstract class Athlete {
    String name, country ;

    public Athlete(String name, String country) {
        this.name=name; this.country=country;
    }
    abstract void displayStats();
}
class Footballer extends Athlete {
    int goals, assists ;

    public Footballer(String name, String country, int goals, int assists) {
        super(name, country);
        this.goals=goals; this.assists=assists;
    }
    public void displayStats() {
        System.out.println("Name, country display using simple this.name , goals = "+this.goals);
    }
}

public class AbstractClass {
    public static void main (String [] args) {
        Footballer messi = new Footballer("Messi", "Argentina", 969, 549);
        messi.displayStats();
    }
}
