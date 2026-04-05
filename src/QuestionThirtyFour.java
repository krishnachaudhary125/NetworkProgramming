import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestionThirtyFour {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("HTTP File Server on http://localhost:8080");
        while (true) {
            Socket client = ss.accept();
            new Thread(() -> {
                try {
                    BufferedReader in  = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    OutputStream out = client.getOutputStream();
                    String request = in.readLine();
                    System.out.println("Request: " + request);
                    String fileName = request.split(" ")[1].substring(1);
                    if (fileName.isEmpty()) fileName = "index.html";
                    File file = new File(fileName);
                    if (file.exists()) {
                        byte[] data = java.nio.file.Files.readAllBytes(file.toPath());
                        out.write(("HTTP/1.1 200 OK\r\nContent-Length: " + data.length + "\r\n\r\n").getBytes());
                        out.write(data);
                    } else {
                        String body = "<h1>404 Not Found</h1>";
                        out.write(("HTTP/1.1 404 Not Found\r\nContent-Length: " + body.length() + "\r\n\r\n" + body).getBytes());
                    }
                    client.close();
                } catch (Exception e) { e.printStackTrace(); }
            }).start();
        }
    }
}
