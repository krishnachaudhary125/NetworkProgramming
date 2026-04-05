import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestionTwentyNineServer {
    static long factorial(int n) { return n <= 1 ? 1 : n * factorial(n - 1); }
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(7000);
        System.out.println("Factorial Server started...");
        Socket client = ss.accept();
        BufferedReader in  = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out  = new PrintWriter(client.getOutputStream(), true);
        int num = Integer.parseInt(in.readLine());
        out.println("Factorial of " + num + " = " + factorial(num));
        client.close(); ss.close();
    }
}
