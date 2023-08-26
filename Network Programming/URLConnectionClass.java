// wap to print source code of ncit website
import java.io.*;
import java.net.*;

public class URLConnectionClass {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.ncit.edu.np");
        URLConnection cn = url.openConnection();
        InputStream in = cn.getInputStream();
        int i;
        while((i=in.read())!=-1) {
            System.out.print((char)i);
        }
    }    
}
