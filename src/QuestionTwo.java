//2.Write a program to implement InetAddress getter methods.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class QuestionTwo {
    public static void main(String[] args) {
        try{
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("Host Name = "+inet.getHostName());
            System.out.println("Host Address = "+inet.getHostAddress());
            System.out.println("Canonical Host = "+inet.getCanonicalHostName());
            System.out.println("Is Loop Back = "+inet.isLoopbackAddress());
            System.out.println("Is Reachable = "+inet.isReachable(2000));
            System.out.println("Is Multicast = "+inet.isMulticastAddress());
        }catch(UnknownHostException e){
            System.out.println("Error unknown host.");
        }catch(Exception e){
            System.out.println("Error occurred.");
        }
    }
}
