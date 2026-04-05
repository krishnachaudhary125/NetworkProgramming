import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestionTwentyEightServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        System.out.println("Server waiting...");
        Socket client = ss.accept();
        BufferedReader in  = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out  = new PrintWriter(client.getOutputStream(), true);
        BufferedReader kbd  = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (true) {
            msg = in.readLine();
            if (msg == null || msg.equals("bye")) break;
            System.out.println("Client: " + msg);
            System.out.print("Server: ");
            out.println(kbd.readLine());
        }
        client.close(); ss.close();
    }
}
