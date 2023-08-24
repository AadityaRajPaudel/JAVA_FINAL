/*
 * Types of Nested Class: Static and Non-Static Nested class
 * Non-static -> local inner, member innner, anonymus
 */

 // Member inner class
class Outer {
    int value = 10 ;
    class Inner {
        public void display() {
            System.out.println("Value = "+value);
        }
    }
}

public class NestedClass {
    public static void main (String [] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
// Local Inner Class
/*
class Outer {
    int value = 10 ;
    public void disp() {
        class Inner {
            public void show() {
                s.o.p("Value");
            }
            Inner in = new Inner() ;
            in.disp();
        }
    }
}
*/

//Anonymus class
/*
interface Animal {
    public void sound() ;
}
class Test implements Animal {
    psvm {
        Animal dog = new Animal() {
            public void sound() {
                s.o.p("Bark");
            }
        }
    }
}
*/

//Static Nested Class
/*
class Outer {
    static int value = 10 ;
    static class Inner {
        void disp() {
            sop("Value");
        }
    }
}
//roughly
Outer.Inner in = new Outer.Inner();
in.disp();
 */