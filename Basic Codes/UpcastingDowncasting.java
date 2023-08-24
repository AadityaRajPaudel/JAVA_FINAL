/*
    Upcasting/Widening - Converting lower byte datatype to higher
    Downcasting/Narrowing - Higher byte to lower
 */

class UpcastingDowncasting {
    public static void main (String [] args) {
        //Upcasting- converting int to float
        int a = 10 ;
        float f = a ;
        System.out.println("Upcasted value:"+f);

        //Downcasting
        float p = 10.5f ; // f in 10.5f is mandatory while initializing any float value
        int q = (int)p; // downcasting requires type casting
        System.out.println("Downcasted value:"+q);
    }
}