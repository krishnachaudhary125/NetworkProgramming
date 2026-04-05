import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FourtyFiveImplementation extends UnicastRemoteObject implements FourtyFiveInterface {
    public FourtyFiveImplementation() throws RemoteException {}
    public int gcd(int a, int b) {
        while (b != 0) { int t = b; b = a % b; a = t; }
        return a;
    }
}
