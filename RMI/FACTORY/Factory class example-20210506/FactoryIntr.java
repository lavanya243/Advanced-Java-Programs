import java.rmi.*;
public interface FactoryIntr extends Remote
{
public Book getreference(String bname)throws RemoteException;
}
