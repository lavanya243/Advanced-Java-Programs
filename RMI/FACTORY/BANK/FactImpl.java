import java.rmi.*;
import java.rmi.server.*;
public class FactImpl extends UnicastRemoteObject implements Fact
{
String name;
public FactImpl(String b)throws RemoteException
{
name=b;
}
public float Deposit(float amt,float curamt)throws RemoteException
{
curamt += amt;
return curamt;
}
public float Withdraw(float amt,float curamt)throws RemoteException
{
curamt-=amt;
return curamt;
}
}
