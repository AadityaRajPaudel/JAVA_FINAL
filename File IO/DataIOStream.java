// writing datas to a file
import java.io.* ;
import java.util.Scanner ;

public class DataIOStream {
    public static void main (String [] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("datas.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name: ");
            String namee = scan.next();
            System.out.println("Enter address: ");
            String address = scan.next();
            System.out.println("Enter Salary: ");
            int salary = scan.nextInt();
            dos.writeUTF(namee);
            dos.writeUTF(address);
            dos.writeInt(salary);

            System.out.println("Enter n to exit:");
            String prompt = scan.next();
            if (prompt.toLowerCase().startsWith("n")) break;
        }
        dos.close();
        fos.close();
    }    
}
