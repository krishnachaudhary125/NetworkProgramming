//	Write a program for multicast sniffer.
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class QuestionFortyFour {
    public static void main(String[] args) throws Exception {
        InetAddress group = InetAddress.getByName("230.0.0.1");
        MulticastSocket socket = new MulticastSocket(5555);
        socket.joinGroup(group);
        System.out.println("Multicast Sniffer listening on 230.0.0.1:5555...");
        while (true) {
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            socket.receive(packet);
            System.out.println("[" + packet.getAddress() + ":" + packet.getPort() + "] "
                    + new String(packet.getData(), 0, packet.getLength()));
        }
    }
}
