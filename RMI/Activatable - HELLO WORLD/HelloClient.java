import java.rmi.*;

public class HelloClient

{

        public static void main(String args[])throws RemoteException, java.net.MalformedURLException



        {

                try{

        System.setSecurityManager(new RMISecurityManager());

                Hello ref=(Hello)Naming.lookup("rmi://localhost/Server");

                String ret=ref.sayHello();

                System.out.println(ret);

                }catch(Exception e){e.printStackTrace();}

        }

}

