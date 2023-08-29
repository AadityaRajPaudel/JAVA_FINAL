import java.io.*;
import java.net.*;

public class PalindromeServer {
    public static void main(String[] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(8000);
        Socket s = ss.accept();
        if(s!=null) {
            System.out.println("Connected");
        }

        
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String word = dis.readUTF();
            Boolean pali = isPalindrome(word);
            dos.writeBoolean(pali);
        

    }
    public static boolean isPalindrome(String word) {
        String rev = "";
        for (int i=word.length()-1; i>-0; i++){
            rev += word.charAt(i);
        }
        if (rev.equalsIgnoreCase(word)) {return true;}
        else {
            return false;
        }
    }
}
