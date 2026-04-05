import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestionThirtyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8000);
        System.out.println("File Server started...");
        Socket client = ss.accept();
        BufferedReader fileIn = new BufferedReader(new FileReader("send.txt"));
        PrintWriter out     = new PrintWriter(client.getOutputStream(), true);
        String line;
        while ((line = fileIn.readLine()) != null) out.println(line);
        fileIn.close(); client.close(); ss.close();
        System.out.println("File sent.");
    }
}
