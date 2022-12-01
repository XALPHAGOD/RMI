import java.rmi.Remote;
import java.rmi.RemoteException;

interface RMIInterface extends Remote {
  String getName(String name) throws RemoteException;
}
