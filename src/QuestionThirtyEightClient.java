import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuestionThirtyEightClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("localhost");
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter message: ");
        String msg = kbd.readLine();
        byte[] buf = msg.getBytes();
        socket.send(new DatagramPacket(buf, buf.length, addr, 5000));
        DatagramPacket recv = new DatagramPacket(new byte[1024], 1024);
        socket.receive(recv);
        System.out.println("Echo: " + new String(recv.getData(), 0, recv.getLength()));
        socket.close();
    }
}
