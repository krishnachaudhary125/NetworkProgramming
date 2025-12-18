//Write a program to retrieve information from header using header specific methods.

import java.net.*;
import java.util.Date;

public class QuestionNineteen {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.connect();

            System.out.println("=== Header Information from Server ===");

            System.out.println("Date: " + new Date(conn.getDate()));
            System.out.println("Content-Type: " + conn.getContentType());
            System.out.println("Content-Length: " + conn.getContentLength());
            System.out.println("Last-Modified: " + new Date(conn.getLastModified()));
            System.out.println("Expiration: " + new Date(conn.getExpiration()));

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}