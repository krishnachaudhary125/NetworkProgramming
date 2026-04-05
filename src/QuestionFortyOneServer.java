//	Write a program to create a UDP client and server to check given number is Armstrong or not.
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class QuestionFortyOneServer {
    static boolean isArmstrong(int n) {
        int temp = n, digits = String.valueOf(n).length(), sum = 0;
        while (temp != 0) { sum += Math.pow(temp % 10, digits); temp /= 10; }
        return sum == n;
    }
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(7100);
        System.out.println("Armstrong Server started...");
        DatagramPacket packet = new DatagramPacket(new byte[256], 256);
        socket.receive(packet);
        int num = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()).trim());
        String result = num + " is " + (isArmstrong(num) ? "Armstrong" : "Not Armstrong");
        socket.send(new DatagramPacket(result.getBytes(), result.length(), packet.getAddress(), packet.getPort()));
        socket.close();
    }
}
