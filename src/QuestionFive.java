//Write a program to print the characteristics (address types) of an IP address.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class QuestionFive {

    public static void main(String[] args) {
        try {
            String ipAddress = "192.168.1.10";
            InetAddress address = InetAddress.getByName(ipAddress);

            System.out.println("IP Address: " + address.getHostAddress());

            System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
            System.out.println("Is Multicast Address? " + address.isMulticastAddress());
            System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
            System.out.println("Is Link Local Address? " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address? " + address.isSiteLocalAddress());
            boolean isUnicast = !address.isMulticastAddress() && !address.isLoopbackAddress() && !address.isAnyLocalAddress();
            System.out.println("Is Unicast Address? " + isUnicast);

        } catch (UnknownHostException e) {
            System.out.println("Invalid IP address.");
            e.printStackTrace();
        }
    }
}