//	Write a program to create a UDP daytime client and server.
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class QuestionThirtyNineServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(1301);
        System.out.println("UDP Daytime Server started...");
        while (true) {
            DatagramPacket req = new DatagramPacket(new byte[256], 256);
            socket.receive(req);
            byte[] time = new Date().toString().getBytes();
            socket.send(new DatagramPacket(time, time.length, req.getAddress(), req.getPort()));
        }
    }
}
