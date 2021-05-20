import java.rmi.*;
public class HelloServer
{
public static void main(String args[])
{
    try
    {
    HelloImpl hello=new HelloImpl();
    Naming.rebind("rmi://localhost/MyObject",hello);
    System.out.println("bound to registry");
    }
    catch(Exception e){e.printStackTrace();}
} 
}