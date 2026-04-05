//Write a program to print the entire HTTP header.

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class QuestionTwentyTwo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.example.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        Map<String, List<String>> headers = conn.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headers.entrySet())
            System.out.println(entry.getKey() + " => " + entry.getValue());
    }
}
