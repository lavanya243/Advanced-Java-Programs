import java.rmi.*;
import java.util.*;
public class Client
{
public static void main(String args[])throws RemoteException
{
try{
    float curamt=0,amt=0;
    int accno=0;
    float amount;
    String name="";
    FactoryIntr ob=(FactoryIntr)Naming.lookup("rmi://localhost/Myob");
    Fact b=(Fact)ob.getreference("Java");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    name=sc.next();
    System.out.println("Enter your accno");
    accno=sc.nextInt();
    System.out.println("Enter your current account balance");
    curamt=sc.nextFloat();
    System.out.println("Enter \n1. TO DEPOSIT \n2. TO WITHDRAW");
    System.out.println("Enter your choice");
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1 :System.out.print("Enter the Amount to be deposited : ");
                amt = sc.nextFloat();
                amount = b.Deposit(amt,curamt);
                System.out.println("Successful");
                System.out.println("Your Current Balance is "+amount);
                break;
        case 2 : System.out.print("Enter the Amount to be Withdraw : ");
                amt = sc.nextFloat();
                if(amt < curamt)
                {
                    amount = b.Withdraw(amt,curamt);
                    System.out.println("Withdrawal Successful");
                    System.out.println("Your Current Balance is "+amount);
                }
                else
                    System.out.println("No sufficient amount, Withdrawal not possible ");
                break;
        
        default : System.out.println("Invalid operation");
    }

    

}catch(Exception e){e.printStackTrace();}
}
}