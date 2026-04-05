//Illustrate the process for communicating with Multicast group.

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class QuestionFortyThreeSender {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket();
        InetAddress group = InetAddress.getByName("230.0.0.1");
        String msg = "Hello Multicast Group!";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, 5555);
        socket.send(packet);
        System.out.println("Multicast message sent: " + msg);
        socket.close();
    }
}
