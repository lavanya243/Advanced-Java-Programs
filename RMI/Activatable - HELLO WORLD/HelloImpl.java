import java.rmi.*;
import java.rmi.activation.*;

import java.rmi.server.*;
import java.io.*;



public class HelloImpl extends Activatable   implements Hello 
{


    public HelloImpl() throws RemoteException,ActivationException,IOException 
	{

        super(null,null,false,0); 

	    }

    protected HelloImpl(ActivationID id,MarshalledObject obj) throws RemoteException,ActivationException,IOException 

	{

	        super(id,0); //activation constructor 

	    }



    public String sayHello() 
	{

	        return  "Hello World!";

	    }	



}
