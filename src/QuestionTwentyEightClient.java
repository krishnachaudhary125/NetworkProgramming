//	Write a program to create a TCP client and server to share text messages.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuestionTwentyEightClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (true) {
            System.out.print("Client: ");
            msg = kbd.readLine();
            out.println(msg);
            if (msg.equals("bye")) break;
            System.out.println("Server: " + in.readLine());
        }
        socket.close();
    }
}
