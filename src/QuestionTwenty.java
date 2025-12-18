//Write a program to retrieve information from header using arbitrary header methods.

import java.net.HttpURLConnection;
import java.net.URL;

public class QuestionTwenty {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();

            System.out.println("HTTP Header Information:\n");

            for (int i = 0; ; i++) {
                String headerKey = con.getHeaderFieldKey(i);
                String headerValue = con.getHeaderField(i);

                if (headerKey == null && headerValue == null) {
                    break;
                }

                System.out.println(headerKey + " : " + headerValue);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
