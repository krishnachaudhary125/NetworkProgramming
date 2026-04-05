import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuestionFortyClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("localhost");
        String msg = "Hello from UDP Client!";
        socket.send(new DatagramPacket(msg.getBytes(), msg.length(), addr, 6100));
        DatagramPacket recv = new DatagramPacket(new byte[1024], 1024);
        socket.receive(recv);
        System.out.println("Server: " + new String(recv.getData(), 0, recv.getLength()));
        socket.close();
    }
}
