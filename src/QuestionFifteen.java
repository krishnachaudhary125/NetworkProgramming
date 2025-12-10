//Write a program to show the use of URLDecoder Class.

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class QuestionFifteen {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encoded = "https%3A%2F%2Fexample.com%3A8080%2Fpath%2Fto%2Fresource%3Fname%3DKrishna";
        String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8.toString());

        System.out.println("Encoded : "+encoded);
        System.out.println("Decoded : "+decoded);
    }
}
