import java.io.*;

class Student implements Serializable{
    String name;
    public Student(String name) {
        this.name=name;
    }
    public void disp(){
        System.out.println("Name="+this.name);
    }
}

public class Serializationn {
    public static void writeObject(Student s) throws Exception{
        FileOutputStream fos=new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
    public static void readObject() throws Exception{
        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        System.out.println("Name="+s.name);
        ois.close();
        fis.close();
    }
    public static void main(String[] args) throws Exception{
        Student s = new Student("Alex");
        Serializationn ss = new Serializationn();
        ss.writeObject(s);
        ss.readObject();
        
    }
}
