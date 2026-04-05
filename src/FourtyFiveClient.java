import java.rmi.Naming;

public class FourtyFiveClient {
    public static void main(String[] args) throws Exception {
        FourtyFiveInterface service = (FourtyFiveInterface) Naming.lookup("rmi://localhost/GCDService");

        int a = 48, b = 18;
        System.out.println("GCD(" + a + ", " + b + ") = " + service.gcd(a, b));
    }
}