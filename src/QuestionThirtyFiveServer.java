//Illustrate the procedure of creating secure client and server socket.
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QuestionThirtyFiveServer {
    public static void main(String[] args) throws Exception {
        SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket ss = (SSLServerSocket) factory.createServerSocket(9443);
        System.out.println("SSL Server started on port 9443...");
        SSLSocket client = (SSLSocket) ss.accept();
        BufferedReader in  = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out  = new PrintWriter(client.getOutputStream(), true);
        System.out.println("Client: " + in.readLine());
        out.println("Hello from SSL Server!");
        client.close(); ss.close();
    }
}
