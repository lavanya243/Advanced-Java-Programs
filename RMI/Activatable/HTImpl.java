import java.rmi.*;
import java.rmi.activation.*;

import java.rmi.server.*;
import java.io.*;



public class HTImpl extends Activatable   implements HospitalToken 
{


    public HTImpl() throws RemoteException,ActivationException,IOException 
	{

        super(null,null,false,0); 

	    }

    protected HTImpl(ActivationID id,MarshalledObject obj) throws RemoteException,ActivationException,IOException 

	{

	        super(id,0); //activation constructor 

	    }



    public int getToken(int n) 
	{


	        return  n+1;

	    }	



}
