import java.io.*;
import java.net.*;
import java.util.*;

public class F7Client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 8000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any count exceeding 2:");
        int n = scan.nextInt();
        dos.writeInt(n);
        String str = dis.readUTF();

        System.out.println("The series is:"+ str);
    }
}
