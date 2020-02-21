package me.wonsey.ood.piggybank;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PiggyBank extends UnicastRemoteObject implements IPiggyBank
{
   
   private double balance;

   public PiggyBank() throws RemoteException
   {
      super();
      this.balance = 0;
   }

   @Override
   public void addPenny() throws RemoteException
   {
      this.balance += 0.01;
   }

   @Override
   public void addNickel() throws RemoteException
   {
      this.balance += 0.05;
   }

   @Override
   public void addDime() throws RemoteException
   {
      this.balance += 0.10;
   }

   @Override
   public void addQuarter() throws RemoteException
   {
      this.balance += 0.25;
   }

   @Override
   public double getBalance() throws RemoteException
   {
      return this.balance;
   }

}
