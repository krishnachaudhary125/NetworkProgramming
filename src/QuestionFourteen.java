//Write a program to show the use of URLEncoder Class.

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class QuestionFourteen {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String urlString = "https://example.com:8080/path/to/resource?name=Krishna";
        String encoded = URLEncoder.encode(urlString, StandardCharsets.UTF_8.toString());

        System.out.println("URL to be encoded : "+urlString);
        System.out.println("Encoded : "+ encoded);
    }
}
