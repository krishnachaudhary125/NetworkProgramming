//Write a program to set the TCP server socket options.
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class QuestionThirtyThree {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket();
        ss.setReuseAddress(true);
        ss.setReceiveBufferSize(65536);
        ss.setSoTimeout(10000);
        ss.bind(new InetSocketAddress(4500));
        System.out.println("ReuseAddress  : " + ss.getReuseAddress());
        System.out.println("Receive Buffer   : " + ss.getReceiveBufferSize());
        System.out.println("Timeout       : " + ss.getSoTimeout());
        ss.close();
    }
}
