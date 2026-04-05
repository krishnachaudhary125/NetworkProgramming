//	Write a program to create TCP echo server and client.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuestionTwentySixClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.print("Enter message: ");
        while ((line = kbd.readLine()) != null) {
            out.println(line);
            System.out.println("Echo: " + in.readLine());
            System.out.print("Enter message: ");
        }
        socket.close();
    }
}
