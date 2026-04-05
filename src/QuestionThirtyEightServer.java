//Write a program to create UDP echo server and client.
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class QuestionThirtyEightServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5000);
        byte[] buf = new byte[1024];
        System.out.println("UDP Echo Server started...");
        while (true) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            System.out.println("Received: " + new String(packet.getData(), 0, packet.getLength()));
            socket.send(new DatagramPacket(packet.getData(), packet.getLength(), packet.getAddress(), packet.getPort()));
        }
    }
}
