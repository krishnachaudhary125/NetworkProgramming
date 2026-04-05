import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QuestionThirtyFiveClient {
    public static void main(String[] args) throws Exception {
        // Set truststore: -Djavax.net.ssl.trustStore=truststore.jks -Djavax.net.ssl.trustStorePassword=password
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) factory.createSocket("localhost", 9443);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("Hello from SSL Client!");
        System.out.println("Server: " + in.readLine());
        socket.close();
    }
}
