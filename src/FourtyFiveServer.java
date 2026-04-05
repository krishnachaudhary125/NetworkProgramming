import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class FourtyFiveServer {
    public static void main(String[] args) throws Exception {
        FourtyFiveInterface obj = new FourtyFiveImplementation();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("GCDService", obj);
        System.out.println("GCD RMI Server started...");
    }
}
