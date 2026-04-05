//Write a program to create a TCP daytime client and server.
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class QuestionTwentySevenServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1300);
        System.out.println("Daytime Server started...");
        while (true) {
            Socket client = ss.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println(new Date().toString());
            client.close();
        }
    }
}
