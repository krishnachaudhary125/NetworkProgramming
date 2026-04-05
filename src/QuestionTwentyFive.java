//Write a program to get information about the TCP socket.

import java.net.Socket;

public class QuestionTwentyFive {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.example.com", 80);
        System.out.println("Local Address : " + socket.getLocalAddress());
        System.out.println("Local Port    : " + socket.getLocalPort());
        System.out.println("Remote Address: " + socket.getInetAddress());
        System.out.println("Remote Port   : " + socket.getPort());
        System.out.println("Send Buffer   : " + socket.getSendBufferSize());
        System.out.println("Receive Buffer   : " + socket.getReceiveBufferSize());
        System.out.println("Keep Alive    : " + socket.getKeepAlive());
        System.out.println("Timeout       : " + socket.getSoTimeout());
        socket.close();
    }
}
