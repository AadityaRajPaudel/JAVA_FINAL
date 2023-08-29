import java.net.*;
import java.io.*;
import java.util.*;

public class F6SERVER {
    public static void main(String [] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(8000);
         
        Socket s = ss.accept();

    while (true) {
        
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        
        String incoming = dis.readUTF();
        System.out.println("Aryn: " + incoming);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your message:");
        String reply = scan.nextLine();
        dos.writeUTF(reply);

    }
        }
    
    }    
