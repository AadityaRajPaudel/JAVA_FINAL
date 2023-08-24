/*
    Wrapper Class- Corresponding classes of datatypes are called wrapper class. Eg: 'Integer' is the wrapper class of 'int' datatype.
 */

public class WrapperClass {
    public static void main (String [] args) {
        //Autoboxing- Converting datatype to wrapper class object
        int a = 10 ;
        Integer i = a ;
        System.out.println("i = "+i.intValue());

        //Unboxing- w.c. object to datatype
        Integer j = 10 ;
        int k = j.intValue() ;
        System.out.println("k = "+k);
    }
}
