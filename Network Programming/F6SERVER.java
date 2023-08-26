import java.net.*;
import java.io.*;
import java.util.*;

public class F6SERVER {
    public static void main(String [] args) throws Exception{
        
        ServerSocket s = new ServerSocket(8000);
         
        Socket ss = s.accept();

    while (true) {
        
        DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
        DataInputStream dis = new DataInputStream(ss.getInputStream());
        
        String incoming = dis.readUTF();
        System.out.println("Aryn: " + incoming);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your message:");
        String reply = scan.nextLine();
        dos.writeUTF(reply);

    }
        }
    
    }    
