//Write a program to create a TCP daytime client and server.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class QuestionTwentySevenClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1300);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Server Time: " + in.readLine());
        socket.close();
    }
}
