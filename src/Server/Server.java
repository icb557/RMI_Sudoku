package Server;

import Implement.SudokuGenerator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("Implement.SudokuGenerator", new SudokuGenerator());
        System.out.println("Server.Server started");
    }
}