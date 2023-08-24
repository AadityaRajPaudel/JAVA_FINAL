// reading from datas.txt
import java.io.* ;

public class DataIOStreamTwo {
    public static void main (String [] args) throws Exception {
        FileInputStream fis = new FileInputStream("datas.txt");
        DataInputStream dis = new DataInputStream(fis);

        if (dis.available() > 0) {
            String name = dis.readUTF() ;
            String address = dis.readUTF();
            int salary = dis.readInt();

            if (name.equals("Raj")) { // we would get all the data of people named Raj
                System.out.println("Name = "+name+" Address = "+address+" Salary = "+salary);
            }
        }
        dis.close();
        fis.close();
    }    
}
