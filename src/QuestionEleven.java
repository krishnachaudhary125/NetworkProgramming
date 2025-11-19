//Write a program to split URL

import java.net.*;

public class QuestionEleven {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com:8080/path/page.html?name=krishna&age=21");

        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Host     : " + url.getHost());
        System.out.println("Port     : " + url.getPort());
        System.out.println("Path     : " + url.getPath());
        System.out.println("File     : " + url.getFile());
        System.out.println("Query    : " + url.getQuery());
    }
}
