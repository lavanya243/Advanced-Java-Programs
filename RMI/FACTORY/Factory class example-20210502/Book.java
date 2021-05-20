import java.rmi.*;
public interface Book extends Remote 
{
public String getname()throws RemoteException;
}
