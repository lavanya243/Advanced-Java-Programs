import java.rmi.*;
public class Client
{
public static void main(String args[])throws RemoteException
{
try{
	FactoryIntr ob=(FactoryIntr)Naming.lookup("rmi://localhost/Myob");
	
	Book b=(Book)ob.getreference("Java Programming");

	String s=b.getname();
	System.out.println(s);


}catch(Exception e){e.printStackTrace();}
}
}
