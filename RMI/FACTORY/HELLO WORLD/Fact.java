import java.rmi.*;
public interface Fact extends Remote
{
public String getname()throws RemoteException;
}