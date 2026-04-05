import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuestionTwentyNineClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 7000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.print("Enter number: ");
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        out.println(kbd.readLine());
        System.out.println("Result: " + in.readLine());
        socket.close();
    }
}
