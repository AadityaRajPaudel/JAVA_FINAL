// Simple Student class initialization

class Student {
    String name ; // name and roll are instance variables
    int roll ;
    static String college = "NCIT" ; // class or static variable

    public Student (String name, int roll) {
        this.name = name ;
        this.roll = roll ;
    }
    public void disp() {
        System.out.println("Name = "+this.name+" Roll = "+this.roll+" College = "+this.college);
    }
}
public class SimpleClass {
    public static void main (String [] args) {
        Student s = new Student ("Messi", 10);
        s.disp();
        s.college = "MIT" ;
        s.disp();
    }
}
