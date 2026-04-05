//	Write a program to create a UDP daytime client and server.
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuestionThirtyNineClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("localhost");
        byte[] buf = "request".getBytes();
        socket.send(new DatagramPacket(buf, buf.length, addr, 1301));
        DatagramPacket recv = new DatagramPacket(new byte[256], 256);
        socket.receive(recv);
        System.out.println("Server Time: " + new String(recv.getData(), 0, recv.getLength()));
        socket.close();
    }
}
