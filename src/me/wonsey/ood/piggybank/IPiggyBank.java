package me.wonsey.ood.piggybank;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPiggyBank extends Remote
{
   public void   addPenny()   throws RemoteException;
   public void   addNickel()  throws RemoteException;
   public void   addDime()    throws RemoteException;
   public void   addQuarter() throws RemoteException;
   public double getBalance() throws RemoteException;
}
