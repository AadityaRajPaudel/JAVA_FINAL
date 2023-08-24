//Reading from Sample.txt

import java.io.*;

public class ReadFromFile {
    public static void main (String [] args) throws Exception {

        FileInputStream fis = new FileInputStream("sample.txt");
        int i ;
        while ((i = fis.read()) != -1) {
            System.out.print((char)i);
        }

        fis.close();
    }    
}
