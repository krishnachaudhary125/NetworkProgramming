//	Write a program to create TCP echo server and client.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestionTwentySixServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Echo Server started on port 5000...");
        Socket client = ss.accept();
        BufferedReader in  = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out  = new PrintWriter(client.getOutputStream(), true);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received: " + line);
            out.println(line);
        }
        client.close(); ss.close();
    }
}
