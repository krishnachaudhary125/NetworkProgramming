//Write a program to get information about the UDP socket.
import java.net.DatagramSocket;

public class QuestionThirtySix {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5500);
        System.out.println("Local Address : " + socket.getLocalAddress());
        System.out.println("Local Port    : " + socket.getLocalPort());
        System.out.println("Send Buffer   : " + socket.getSendBufferSize());
        System.out.println("Receive Buffer   : " + socket.getReceiveBufferSize());
        System.out.println("Timeout       : " + socket.getSoTimeout());
        System.out.println("Broadcast     : " + socket.getBroadcast());
        socket.close();
    }
}
