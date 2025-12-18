//Write a program to download a web page with the correct character set.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class QuestionTwentyOne {
    public static void main(String[] args) {
        try{
            URL uri = new URL("https://www.example.com");
            HttpURLConnection conn = (HttpURLConnection) uri.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            String charset = "UTF-8";
            String contentType = conn.getContentType();
            for(String param : contentType.replace("", "").split(";")){
                if(param.startsWith("charset = ")){
                    charset = param.split("=", 2)[1];
                    break;
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
            String inputLine;
            while((inputLine = in.readLine()) != null){
                in.close();
                conn.disconnect();
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}