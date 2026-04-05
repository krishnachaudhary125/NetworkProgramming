//Write a program to set the TCP client socket options.
import java.net.Socket;

public class QuestionThirtyTwo {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.example.com", 80);
        socket.setSoTimeout(3000);
        socket.setSendBufferSize(65536);
        socket.setReceiveBufferSize(65536);
        socket.setKeepAlive(true);
        socket.setTcpNoDelay(true);
        socket.setSoLinger(true, 10);
        System.out.println("Timeout       : " + socket.getSoTimeout());
        System.out.println("Send Buffer   : " + socket.getSendBufferSize());
        System.out.println("Receive Buffer   : " + socket.getReceiveBufferSize());
        System.out.println("KeepAlive     : " + socket.getKeepAlive());
        System.out.println("TcpNoDelay    : " + socket.getTcpNoDelay());
        socket.close();
    }
}
