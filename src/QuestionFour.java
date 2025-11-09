//Write a program to list the interfaces available in your system.

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.List;

public class QuestionFour {
    public static void main(String[] args) {
        try{
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            System.out.println("Available network interface.");
            for (NetworkInterface ni : interfaces){
                System.out.println(". "+ni.getName()+" ("+ni.getDisplayName()+")");
            }
        }catch (SocketException e){
            System.out.println("Error fetching network interfaces : "+e.getMessage());
        }
    }
}
