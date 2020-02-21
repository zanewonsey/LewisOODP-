package me.wonsey.ood.television;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import me.wonsey.ood.piggybank.*;

public class ApplicationServer
{

   public static void main(String[] args) throws RemoteException, AlreadyBoundException
   {
      Registry registry = LocateRegistry.createRegistry(5099);
      System.out.println("Registry created");
      
      registry.bind("RemoteHello", new MyRemoteImplementation());
      System.out.println("MyRemoteImplementation bound");
      
      registry.bind("RemotePiggyBank", new PiggyBank());
      System.out.println("PiggyBank bound");
      
      System.out.println("Running");
   }
}
