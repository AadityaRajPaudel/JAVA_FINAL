/*
 Interface: They are the blueprint of a class/object. They have static and final data members, methods are public and abstract.
 This example shows both interface and multiple inheritance.
 */

interface One {
    int value = 10 ; // final variable
    public void displayOne(); // abstract method
}
interface Two {
    int value = 20 ;
    public void displayTwo() ;
}
public class Interface implements One, Two{ //multiple inheritance
    public static void main (String [] args) {
        Interface i = new Interface();
        i.displayOne();
        i.displayTwo();
    }
    //Overriding
    public void displayOne() {
        System.out.println("This is one");
    }
    public void displayTwo(){
        System.out.println("This is two");
    }
}
