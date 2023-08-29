import java.io.*;
import java.net.*;

public class ClientHandler extends Thread {
    Socket s;
    public ClientHandler(Socket s) throws Exception {
        this.s=s ;
    }
    public void run(){
        try{
        DataInputStream dis = new DataInputStream(this.s.getInputStream());
        DataOutputStream dos = new DataOutputStream(this.s.getOutputStream());
        while (true) {
            String clientMsg = dis.readUTF();
            if(clientMsg.equals("bye")){
                break;
            }
            dos.writeUTF(clientMsg.toUpperCase());
        }
        dis.close();
        dos.close();
        this.s.close();
    }catch(Exception e) {
        System.out.println(e.getMessage());
    }
    }
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 8000);
        ClientHandler c = new ClientHandler(s);
        c.start();
    }
}
