//Write a program to create a TCP client and server to share a text file.
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class QuestionThirtyClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8000);
        BufferedReader in      = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter fileOut = new PrintWriter(new FileWriter("received.txt"));
        String line;
        while ((line = in.readLine()) != null) { fileOut.println(line); System.out.println(line); }
        fileOut.close(); socket.close();
        System.out.println("File received as received.txt");
    }
}
