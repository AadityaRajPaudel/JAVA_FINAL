// to remember: getClass, getField, etc... getName
import java.lang.reflect.*;

class Sample{
    private int value ;
    public Sample() {
        this.value = 10; 
    }
    public void publicMethod() {
        System.out.println("This is public");
    }
    public void privateMethod(){
        System.out.println("This is private");
    }
}

public class ReflectionAPI {
    public static void main(String [] args) throws Exception{

        Sample s = new Sample();
        Class cls = s.getClass() ;
        System.out.println("Class Name = "+cls.getName());
        Field [] field = cls.getFields();
        for (Field i: field) {
            System.out.println(i.getName());
        }
        Method [] method = cls.getMethods();
        for (Method i: method) {
            System.out.println(i.getName());
        }
        Field f = cls.getDeclaredField("value");
        f.setAccessible(true);
        f.set(s, 100);
        Method m = cls.getDeclaredMethod("publicMethod");
        m.invoke(s);
        Method n = cls.getDeclaredMethod("privateMethod");
        n.setAccessible(true);
        n.invoke(s);
    }
}
