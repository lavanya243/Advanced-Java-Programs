import java.rmi.*;
public class Server
{
public static void main(String args[])
{
try{
FactoryImpl ob=new FactoryImpl();
Naming.rebind("rmi://localhost/Myob",ob);
System.out.println("Server Running!!!");
}catch(Exception e)
{
e.printStackTrace();
}
}
}