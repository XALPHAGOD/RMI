import java.rmi.Naming;
import java.util.Scanner;

class Client {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    try {
      RMIInterface stub = (RMIInterface) Naming.lookup(
        "rmi://localhost:5000/ABCD"
      );
      System.out.print("Enter Name: ");
      System.out.println(stub.getName(sc.nextLine()));
    } catch (Exception e) {
      e.printStackTrace();
    }
    sc.close();
  }
}
