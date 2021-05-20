import java.rmi.*;
public class HelloClient
{
public static void main(String args[])throws RemoteException
{
try{
Hello
ref=(Hello)Naming.lookup("rmi://localhost/MyObject");
String ret=ref.sayHello();
System.out.println(ret);
}catch(Exception e){e.printStackTrace();}
}
}