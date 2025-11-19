//Write a program to check which protocol does a virtual machine support?

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class QuestionTwelve {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();
            conn.connect();
            System.out.println("Connection established successfully.");

            System.out.println("URL : "+url.getHost());
            System.out.println("Supported Protocol : "+url.getProtocol());
            System.out.println("Port : "+url.getDefaultPort());

        } catch(IOException e){
            System.out.println(e);
        }
    }
}
