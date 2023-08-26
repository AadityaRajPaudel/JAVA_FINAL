import java.util.*;
import java.net.*;
import java.io.*;
public class F6 {
   
    public static void main(String [] args) {
        try {
           
            Socket s = new Socket("localhost", 8000);
            
            while(true) {
            System.out.print("Enter your message: ");
            Scanner scan = new Scanner(System.in);
            String msgclient = scan.next();

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());

            dos.writeUTF(msgclient);

            String reply = dis.readUTF();
            System.out.println("Server: " + reply);

        }
    }
        catch(IOException e1) {
            System.out.println(e1.getMessage());
        }
    }
}