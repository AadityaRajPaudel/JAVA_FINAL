// Custom Exception

class SemesterException extends Exception{
    public SemesterException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int sem ;
    public Student(String name, int sem) throws SemesterException {
        if (sem>8 || sem<1) throw new SemesterException("Invalid Semester.");
        this.name = name ;
        this.sem = sem ;
    }
}

public class CustomException {
    public static void main(String [] args) {
        try {
            Student s = new Student("Messi", 9) ;
        }catch (SemesterException e) {
            System.out.println(e.getMessage());
        }
    }
}