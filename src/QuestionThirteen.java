//Write a program to display the parts of URI.

import java.net.URI;
import java.net.URISyntaxException;

public class QuestionThirteen {
    public static void main(String[] args) throws URISyntaxException {
        String uriString = "https://example.com:8080/path/to/resource?firstNameame=Krishna&lastName=Chaudhary";
        URI uri = new URI(uriString);

        System.out.println("uriString : "+uriString);
        System.out.println("Schema : "+uri.getScheme());
        System.out.println("Host : "+uri.getHost());
        System.out.println("Path : "+uri.getPath());
        System.out.println("Query : "+uri.getQuery());
        System.out.println("Port : "+uri.getPort());
    }
}
