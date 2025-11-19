//Write a program to illustrate factory and getter method

import java.net.NetworkInterface;
import java.net.SocketException;

public class QuestionNine {
    public static void main(String[] args) {
        try{
            //Factory Method
            NetworkInterface netI = NetworkInterface.getByName("ethernet_0");

            if(netI != null){
                //Getter Method
                System.out.println("Name : "+netI.getName());
                System.out.println("Display Name : "+netI.getDisplayName());
                System.out.println("Is Up : "+netI.isUp());
                System.out.println("Is Loop Back : "+netI.isLoopback());
                System.out.println("Support Multicast : "+netI.supportsMulticast());
            }else{
                System.out.println("Interface "+"ethernet_0 "+"is not found.");
            }
        }catch(SocketException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
