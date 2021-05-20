import java.rmi.*;
public interface HospitalToken extends Remote {

    public int getToken(int n) throws RemoteException;

}

