//Write a program to create a Multi-threaded TCP server and client to check the prime number.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestionThirtyOneServer {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
    static class ClientHandler extends Thread {
        Socket socket;
        ClientHandler(Socket s) { this.socket = s; }
        public void run() {
            try {
                BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out  = new PrintWriter(socket.getOutputStream(), true);
                int num = Integer.parseInt(in.readLine());
                out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
                socket.close();
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9000);
        System.out.println("Prime Server started (multi-threaded)...");
        while (true) new ClientHandler(ss.accept()).start();
    }
}
