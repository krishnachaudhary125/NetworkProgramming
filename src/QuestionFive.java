//Write a program to print the characteristics (address types) of an IP address.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class QuestionFive {
    public static void main(String[] args) {
        String inputIP = "192.168.1.10";

        try {
            InetAddress ip = InetAddress.getByName(inputIP);

            System.out.println("IP Address: " + inputIP);
            if (ip.getHostAddress().contains(":")) {
                System.out.println("Type: IPv6 Address");
            } else {
                System.out.println("Type: IPv4 Address");
            }

            System.out.println("Is Loopback Address? " + ip.isLoopbackAddress());
            System.out.println("Is Multicast Address? " + ip.isMulticastAddress());
            System.out.println("Is Any Local Address? " + ip.isAnyLocalAddress());
            System.out.println("Is Link Local Address? " + ip.isLinkLocalAddress());
            System.out.println("Is Site Local Address? " + ip.isSiteLocalAddress());
            System.out.println("Is Unicast Address? " + isUnicast(ip));

        } catch (UnknownHostException e) {
            System.out.println("Invalid IP Address!");
        }
    }

    public static boolean isUnicast(InetAddress ip) {
        return !ip.isAnyLocalAddress() &&
                !ip.isMulticastAddress() &&
                !ip.isLoopbackAddress();
    }
}
