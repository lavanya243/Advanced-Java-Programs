import java.rmi.*;
public interface Fact extends Remote
{
    public float Deposit(float amt,float curamt)throws RemoteException;
    public float Withdraw(float amt,float curamt)throws RemoteException;
}