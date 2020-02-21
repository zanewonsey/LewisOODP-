package me.wonsey.ood.television;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationServer
{

   public static void main(String[] args) throws RemoteException, AlreadyBoundException
   {
      Registry registry = LocateRegistry.createRegistry(5099);
      System.out.println("ApplicationServer1");
      registry.bind("RemoteHello", new MyRemoteImplementation());
      System.out.println("ApplicationServer2");
   }
}
