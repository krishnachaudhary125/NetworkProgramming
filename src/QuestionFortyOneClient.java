import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuestionFortyOneClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("localhost");
        System.out.print("Enter number: ");
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        String num = kbd.readLine();
        socket.send(new DatagramPacket(num.getBytes(), num.length(), addr, 7100));
        DatagramPacket recv = new DatagramPacket(new byte[256], 256);
        socket.receive(recv);
        System.out.println("Result: " + new String(recv.getData(), 0, recv.getLength()));
        socket.close();
    }
}
