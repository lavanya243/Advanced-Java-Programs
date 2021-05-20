import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class calcimpl extends UnicastRemoteObject implements calc
{
protected calcimpl() throws RemoteException
{
super();
}
public int addition(int a,int b)throws RemoteException
{
return a+b;
}
public int subtraction(int a,int b)throws RemoteException
{
return a-b;
}
public int multiplication(int a,int b)throws RemoteException
{
return a*b;
}
public int division(int a,int b)throws RemoteException
{
return a/b;
}
}
