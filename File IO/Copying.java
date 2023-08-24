// Copying the text of 'sample.txt' to 'copy.txt'
import java.io.*;

public class Copying {
    public static void main (String [] args) throws Exception{

        FileInputStream fis = new FileInputStream("sample.txt"); // from where to read
        FileOutputStream fos = new FileOutputStream("copy.txt"); // from where to write
        int i ;
        while ((i=fis.read()) != -1) {
            fos.write(i);
        }
        fos.close();
        fis.close();
    }    
}

/*
 Note: To copy using buffering, same program as this except, use additional bis and bos with arguments as fis and fos, then in future lines, replace fis by bis and fos by bos, others are same as this program
 */
