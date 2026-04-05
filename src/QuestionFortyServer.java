//	Write a program to create a UDP client and server to share text messages.
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class QuestionFortyServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6100);
        byte[] buf = new byte[1024];
        System.out.println("UDP Text Server started...");
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        System.out.println("Client: " + new String(packet.getData(), 0, packet.getLength()));
        String reply = "Hello from UDP Server!";
        socket.send(new DatagramPacket(reply.getBytes(), reply.length(), packet.getAddress(), packet.getPort()));
        socket.close();
    }
}
