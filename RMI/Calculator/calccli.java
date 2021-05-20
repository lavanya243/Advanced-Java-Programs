import java.rmi.Naming;
import java.util.*;
public class calccli
{
public static void main(String args[])
{
int a=0,b=0,ch=0;
try{
calc c=(calc)Naming.lookup("//127.0.0.1:1099/calcservice");
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers: ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Press \n1. ADDITION \n2. SUBTRACTION \n3. MULTIPLICATION \n4. DIVISION \n Enter your choice ");
ch=sc.nextInt();

switch(ch)
{
case 1: System.out.println("Addition:"+c.addition(a,b));
        break;
case 2:System.out.println("Subtraction:"+c.subtraction(a,b));
        break;
case 3:System.out.println("Multiplication:"+c.multiplication(a,b));
        break;
case 4:System.out.println("Division:"+c.division(a,b));
        break;
default: System.out.println("ERROR!!");

}


}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
