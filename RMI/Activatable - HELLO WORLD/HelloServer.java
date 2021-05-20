import java.rmi.*;
import java.rmi.activation.*;
import java.rmi.server.*;
import java.util.*;
public class HelloServer
{

        public static void main(String args[])
        {

                try{
         System.setSecurityManager(new RMISecurityManager());

	 Properties props=new Properties();

	 props.put("java.security.policy","policy");

               ActivationGroupDesc gdesc= new ActivationGroupDesc(props,null);


                ActivationGroupID gid=ActivationGroup.getSystem().registerGroup(gdesc);


                ActivationGroup.createGroup(gid,gdesc,0);

                Hello hello=new HelloImpl();
              
                Naming.rebind("Server",hello);

                System.out.println("bound to registry");


                }catch(Exception e){e.printStackTrace();}

        }

}
