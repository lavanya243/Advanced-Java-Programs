import java.rmi.*;
public class Reg 
{
public static void main(String args[])
{
try{
FactoryImpl ob=new FactoryImpl();
Naming.rebind("rmi://localhost/Myob",ob);
System.out.println("bounded....");
}catch(Exception e)
{
e.printStackTrace();
}
}
}
