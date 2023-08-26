import java.net.*;

public class URL_Processing {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.example.com/path/file?search=smth#pu");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getAuthority());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
    }
}
