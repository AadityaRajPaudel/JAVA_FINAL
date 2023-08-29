import java.io.*;
import java.net.*;
import java.util.*;

public class PalindromeClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 8000);
        Scanner scan = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        System.out.println("Enter word to check:");
        String str = scan.next();
        dos.writeUTF(str);
        Boolean isPalindrome = dis.readBoolean();
        if (isPalindrome) {
            System.out.println("Is palindrome");
        }
        else {
            System.out.println("Is not palindrome");
        }
    }
}
