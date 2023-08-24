// Composition aka has-a rule -> class inside a class

class Storage {
    boolean isSSD ;
    int gb ;
    public Storage (boolean isSSD, int gb) {
        this.isSSD = isSSD ; this.gb = gb ;
    }
    public String toString() {
        String s = " GB = "+this.gb+ (isSSD?" SSD":" Not SSD");
        return s ;
    }
}
class Computer {
    String brand ;
    int price ;
    Storage s ;

    public Computer(String brand, int price, Storage s) {
        this.brand=brand; this.price=price; this.s=s ;
    }
    public String toString(){
        String s = " Brand = "+this.brand+" Price = "+this.price+ this.s;
        return s ;
    }
}

public class Composition {
  public static void main(String [] args) {
    Storage s = new Storage(true, 64);
    Computer c = new Computer("Apple", 1000, s);
    System.out.println(c.toString());
  }
}
