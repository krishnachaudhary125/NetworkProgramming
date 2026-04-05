import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class QuestionThirtySevenClient {
    public static void main(String[] args) throws Exception {
        SocketChannel channel = SocketChannel.open(new InetSocketAddress("localhost", 7500));
        ByteBuffer buf = ByteBuffer.wrap("Hello from NIO Client!".getBytes());
        channel.write(buf);
        buf = ByteBuffer.allocate(1024);
        channel.read(buf);
        buf.flip();
        System.out.println("Server: " + new String(buf.array(), 0, buf.limit()));
        channel.close();
    }
}
