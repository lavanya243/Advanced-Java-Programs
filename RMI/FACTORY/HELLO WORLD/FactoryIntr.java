import java.rmi.*;
public interface FactoryIntr extends Remote
{
public Fact getreference(String bname)throws RemoteException;
}