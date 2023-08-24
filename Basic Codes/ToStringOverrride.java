class Employee {
    String name, post ;
    int id, salary ;
    
    public Employee (String name, String post, int id, int salary) {
        this.name=name; this.post=post; this.id = id; this.salary = salary ;
    }
    public String toString () {
        String s ="\nName = "+this.name+", Post = "+this.post+", ID = "+this.id+", Salary = "+this.salary;
        return s ;
    }

}

public class ToStringOverrride {
    public static void main (String [] args) {
        Employee e1 = new Employee("Messi", "GOAT", 10, 1000);
        System.out.println(e1.toString());
    }
}
