//Write a program to create a TCP client and server to share text messages using NIO.
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class QuestionThirtySevenServer {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(7500));
        System.out.println("NIO Server started...");
        SocketChannel client = ssc.accept();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        client.read(buf);
        buf.flip();
        String msg = new String(buf.array(), 0, buf.limit());
        System.out.println("Received: " + msg);
        buf.clear();
        buf.put("Hello from NIO Server!".getBytes());
        buf.flip();
        client.write(buf);
        client.close(); ssc.close();
    }
}
