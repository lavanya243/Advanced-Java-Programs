import java.rmi.server.*;

import java.rmi.*;



public class FactoryImpl extends UnicastRemoteObject  implements FactoryIntr{

    public FactoryImpl() throws RemoteException {

        super();

    }
// this is the method which makes this //class a factory class because it returns reference to a remote object(Object of SampleReturnImpl)
public Book getreference(String bname)
        {

        BookImpl ob=null;

        try{

         ob=new BookImpl(bname);

        }catch(Exception e){}

        return ob;

        }



}
