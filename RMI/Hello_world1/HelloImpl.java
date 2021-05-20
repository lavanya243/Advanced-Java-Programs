//implementation class which implements the methods specifed in the interface(Hello)
import java.rmi.*;
import java.rmi.server.*;
public class HelloImpl extends UnicastRemoteObject
implements Hello 
{
    public HelloImpl() throws RemoteException 
    {
        super();
    }
    public String sayHello() 
    {
        return "Hello World !";
    }
}