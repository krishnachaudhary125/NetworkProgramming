//Write a program to retrieve data from URL

import java.net.*;
import java.io.*;

public class QuestionTen {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");   // replace with any URL
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
