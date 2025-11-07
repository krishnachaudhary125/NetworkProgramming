//Write a program to check IPv4 and IPv6 Address.

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class QuestionThree {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress net = InetAddress.getLocalHost();
        String ipAddress = String.valueOf(net.getHostAddress());
        System.out.println("Checking Address");
        CheckIP(ipAddress);
    }

    public static void CheckIP(String ip) {
        try{
            InetAddress address = InetAddress.getByName(ip);
            if(address instanceof Inet4Address){
                System.out.println(ip+" is a valid IPv4 address.");
            }else if(address instanceof Inet6Address){
                System.out.println(ip+" is a valid IPv6 address.");
            }else{
                System.out.println(ip+" is unknown address.");
            }
        }catch(UnknownHostException e){
            System.out.println(ip+" is invalid IP address.");
        }
    }
}
