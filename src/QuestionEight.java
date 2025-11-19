//Write a program to retrieve MAC address providing an IP address

import java.net.*;
import java.util.*;

public class QuestionEight {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");

        InetAddress ip = InetAddress.getByName(sc.nextLine());
        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);

        if (ni == null) {
            System.out.println("No interface found for this IP!");
            return;
        }

        byte[] mac = ni.getHardwareAddress();
        if (mac == null) {
            System.out.println("MAC Address not available!");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (byte b : mac) sb.append(String.format("%02X-", b));
        System.out.println("MAC Address: " + sb.substring(0, sb.length() - 1));
    }
}
