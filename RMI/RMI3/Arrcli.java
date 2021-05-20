import java.rmi.Naming;
import java.util.*;
public class Arrcli
{
public static void main(String arg[])
{

try{
Arr c=(Arr)Naming.lookup("//127.0.0.1:1099/Arrservice");
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the array size: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements in the array");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();

int b[]=new int[100];
b=c.arrayeven(a);
System.out.println("Even numbers :");
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}



}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
