import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Arrimpl extends UnicastRemoteObject implements Arr
{
protected Arrimpl() throws RemoteException
{
super();
}
public int[] arrayeven(int [] a)throws RemoteException
{
int l=0,j=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		l++;
	}

	int d[]=new int[l];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
		
		d[j++]=a[i];

		}
	}
	return d;
}

}

