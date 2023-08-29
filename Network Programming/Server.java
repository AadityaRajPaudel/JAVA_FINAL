import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5000);
        while(true) {
            Socket s = ss.accept();
            System.out.println("Client connected using port = "+s.getPort());
            ClientHandler ch = new ClientHandler(s);
            ch.start();
        }
    }    
}
