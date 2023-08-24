//Employee vanni parent class bata teacher vanni child class banauni ani salary calculate garni using super and special teacher cases

class Employee {
    String name, post ;
    int id, salary ;

    public Employee (String name, String post, int id, int salary) {
        this.name=name; this.post=post; this.id = id; this.salary = salary ;
    }
    public int getYearlySalary() {
        return this.salary*12 ;
    }
    public String toString () {
        String s ="\nName = "+this.name+", Post = "+this.post+", ID = "+this.id+", Salary = "+this.salary+" Yearly = "+getYearlySalary();
        return s ;
    }
}
class Teacher extends Employee {
    int nSub ;
    public Teacher (String name, String post, int id, int salary, int nSub) {
        super(name, post, id, salary);
        this.nSub = nSub ;
    }
    public int getYearlySalary(){ // override getYearlySalary because yearly salary is different for teacher depending on nSub
        return super.getYearlySalary()+(100*nSub) ;
    }
    public String toString() {
        String s = super.toString()+" Nsub="+this.nSub;
        return s ;
    }
}

public class Inheritance {
    public static void main (String [] args) {
        Teacher t = new Teacher ("Messi", "Goat", 10, 1000, 4);
        System.out.println(t.toString());
    }
}
