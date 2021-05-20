import java.rmi.*;
import java.util.*;
public class Client
{

        public static void main(String args[])throws RemoteException, java.net.MalformedURLException
        {
                try{
                System.setSecurityManager(new RMISecurityManager());
                String name="";
                HospitalToken ref=(HospitalToken)Naming.lookup("rmi://localhost/Server");
                Scanner sc=new Scanner(System.in);
                System.out.println("****** ABC HOSPITAL ******");
                int n=0;
                int s=1;
                do
                {
                        System.out.println("Enter your name");
                        name=sc.next();
                
                        n=ref.getToken(n);
                        System.out.println("Name: "+name);
                        System.out.println("Your Token number: "+n);
                        System.out.println("Press 1 to get a token ");
                        System.out.println("Press 0 to exit ");
                        s=sc.nextInt();

                }while(s!=0);
                }catch(Exception e){e.printStackTrace();}
        }
}

