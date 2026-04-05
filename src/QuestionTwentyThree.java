//Write a program to configure URLConnection.
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class QuestionTwentyThree {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.example.com");
        URLConnection conn = url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);
        conn.setDoInput(true);
        conn.setDoOutput(false);
        conn.connect();
        System.out.println("Content-Type: " + conn.getContentType());
        System.out.println("Content-Length: " + conn.getContentLength());
        System.out.println("Last-Modified: " + new Date(conn.getLastModified()));
    }
}
