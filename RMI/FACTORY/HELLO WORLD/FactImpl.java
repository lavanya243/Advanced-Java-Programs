import java.rmi.*;
import java.rmi.server.*;
public class FactImpl extends UnicastRemoteObject implements Fact
{
String name;
public FactImpl(String b)throws RemoteException
{
name=b;
}
public String getname()throws RemoteException
{
return name;
}
}