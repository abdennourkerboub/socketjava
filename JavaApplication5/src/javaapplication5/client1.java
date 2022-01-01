import java.io.DataOutputStream;
 import java.io.ObjectInputStream;
 import java.net.Socket;
import java.util.Scanner;


public class client1 {
   public static void main(String[] arg) {
  try {

     Socket socketConnection = new Socket("127.0.0.1", 11111);


     //QUERY PASSING
     DataOutputStream outToServer = new DataOutputStream(socketConnection.getOutputStream());
     System.out.println("Add any text : ");
     Scanner myObj = new Scanner(System.in);
     String SQL = myObj.nextLine();
     System.out.println(SQL.toUpperCase());
     outToServer.writeUTF(SQL);


  } catch (Exception e) {System.out.println(e); }
   }
}