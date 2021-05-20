import java.rmi.Naming;
public class Arrserv
{
Arrserv()
{
try{
Arr c=new Arrimpl();
Naming.rebind("rmi://localhost:1099/Arrservice",c);
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
public static void main(String arg[])
{
new Arrserv();
}
}


