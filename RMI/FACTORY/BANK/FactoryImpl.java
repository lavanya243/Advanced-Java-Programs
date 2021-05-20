import java.rmi.server.*;
import java.rmi.*;
public class FactoryImpl extends UnicastRemoteObject implements
FactoryIntr{
public FactoryImpl() throws RemoteException {
super();
}
public Fact getreference(String bname)
{
FactImpl ob=null;
try{
ob=new FactImpl(bname);
}catch(Exception e){}
return ob;
}
}