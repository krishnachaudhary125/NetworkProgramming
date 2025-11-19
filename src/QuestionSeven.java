//Write a program to retrieve IP address providing Interface address or MAC address

import java.net.*;
import java.util.*;

public class QuestionSeven {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Interface Name: ");
        String name = sc.nextLine();

        NetworkInterface ni = NetworkInterface.getByName(name);

        if (ni == null) {
            System.out.println("Interface not found!");
            return;
        }

        for (InetAddress ip : Collections.list(ni.getInetAddresses())) {
            if (!ip.isLoopbackAddress()) {
                System.out.println("IP Address: " + ip.getHostAddress());
            }
        }
    }
}
