import java.rmi.*;
import java.rmi.server.*;
public class BookImpl extends UnicastRemoteObject implements Book
{
String name;
public BookImpl(String b)throws RemoteException
{
name=b;
}
public String getname()throws RemoteException
{
return name;
}
}
