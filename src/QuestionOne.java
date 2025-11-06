//Write a program to display the IP address of your system.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class QuestionOne {
    public static void main(String[] args) {
        try{
            InetAddress InetAddress = java.net.InetAddress.getLocalHost();
            System.out.println("Host name : "+InetAddress.getHostName());
            System.out.println("IP Address : "+InetAddress.getHostAddress());
        }catch (UnknownHostException e){
            System.out.println("Unable to get IP address.");
        }
    }
}
