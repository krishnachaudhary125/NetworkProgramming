import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuestionThirtyOneClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        out.println(kbd.readLine());
        System.out.println("Result: " + in.readLine());
        socket.close();
    }
}
