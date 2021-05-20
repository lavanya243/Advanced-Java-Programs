import java.rmi.*;
public class Client
{
public static void main(String args[])throws RemoteException
{
try{
FactoryIntr ob=(FactoryIntr)Naming.lookup("rmi://localhost/Myob");
Fact b=(Fact)ob.getreference("Hello World!!");
String s=b.getname();
System.out.println(s);
}catch(Exception e){e.printStackTrace();}
}
}