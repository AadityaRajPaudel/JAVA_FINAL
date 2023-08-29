import java.net.*;
import java.util.*;
import java.io.*;

public class F7Server {
    public static void main(String[] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(8000);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int n = dis.readInt();
        String fibo = "0 1";
        int j= 0 ;
        int k=1;
        int sum;
        for (int i=1; i<=n-2; i++) {
            sum = k+j;
            fibo+=" "+sum;
            j=k;
            k=sum;


        }
        dos.writeUTF(fibo);
        dis.close();
        dos.close();


    }
}
