import java.rmi.Naming;
public class calcserv
{
calcserv()
{
try{
calc c=new calcimpl();
Naming.rebind("rmi://localhost:1099/calcservice",c);
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
public static void main(String args[])
{
new calcserv();
}
}


