// Write a string to a text file say "sample.txt"

import java.io.*;

public class WritingToFile {
    public static void main(String [] args) throws IOException{
        
        String s = "String to be written";
        FileOutputStream fos = new FileOutputStream("sample.txt"); // fos can take extra boolean argument: true for append, false for not append
        byte [] b = s.getBytes();
        fos.write(b);

        fos.close();
    }
}
