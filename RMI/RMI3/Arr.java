import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Arr extends Remote
{
public int[] arrayeven(int a[])throws RemoteException;

}
