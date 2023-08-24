// Definition- Using of mul;tiple same named constructors to initialize the class.

class Shape {
    int l, b, w, h ;
    public Shape(int l, int b, int w, int h) {
        this.l = l; this.b=b; this.w=w; this.h=h;
    }
    public Shape(int w, int h) {
        this(0, 0, w, h);
    }
    public Shape() {
        this (0,0,0,0);
    }
    public void disp() {
        System.out.println("Length = "+this.l+ "\nBreadth: "+this.b+ "\nW = "+this.w+"\nH = "+this.h );
    }
}

public class ConstructorOverloading {
    public static void main (String [] args) {
        Shape s1 = new Shape(10, 20);
        s1.disp();
    }
}
