import java.net.*;

public class HttpURLConnectionClass {
    public static void main(String [] args) throws Exception{
        URL url = new URL("http://www.ncit.edu.np");
        HttpURLConnection cn = (HttpURLConnection) url.openConnection();
        /*
         cn.getResponseCode()
         cn.getRequestMethod();
         cn.getRequestMessage();
         cn.getContentType();
         cn.getContentLength();
         */
    }    
}
