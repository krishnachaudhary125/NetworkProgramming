import java.net.DatagramSocket;

public class QuestionFortyTwo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5600);
        socket.setSoTimeout(5000);
        socket.setSendBufferSize(65536);
        socket.setReceiveBufferSize(65536);
        socket.setBroadcast(true);
        System.out.println("Timeout       : " + socket.getSoTimeout());
        System.out.println("Send Buffer   : " + socket.getSendBufferSize());
        System.out.println("Recv Buffer   : " + socket.getReceiveBufferSize());
        System.out.println("Broadcast     : " + socket.getBroadcast());
        socket.close();
    }
}
