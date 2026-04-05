import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class QuestionFortyThreeReceiver {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket(5555);
        InetAddress group = InetAddress.getByName("230.0.0.1");
        socket.joinGroup(group);
        System.out.println("Joined multicast group, waiting...");
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        socket.receive(packet);
        System.out.println("Received: " + new String(packet.getData(), 0, packet.getLength()));
        socket.leaveGroup(group);
        socket.close();
    }
}
