import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

class Server extends UnicastRemoteObject implements RMIInterface {

  private Server() throws RemoteException {
    super();
  }

  public String getName(String name) {
    return "Hi " + name;
  }

  public static void main(String args[]) {
    try {
      LocateRegistry.createRegistry(5000);
      Naming.rebind("rmi://localhost:5000/ABCD", new Server());
      System.out.println("Server started ...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
