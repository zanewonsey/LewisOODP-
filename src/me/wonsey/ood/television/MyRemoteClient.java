package me.wonsey.ood.television;

import java.rmi.*;

import me.wonsey.ood.piggybank.IPiggyBank;

public class MyRemoteClient
{
   public static void main (String[] args)
   {
      new MyRemoteClient().go();
   }
   
   public void go()
   {
      try
      {//“rmi:/127.0.0.1/RemoteHello”
         MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:5099/RemoteHello");
         String s = service.saySomething();
         System.out.println(s);
         
         IPiggyBank piggyBank = (IPiggyBank) Naming.lookup("rmi://127.0.0.1:5099/RemotePiggyBank");
         piggyBank.addDime();
         piggyBank.addNickel();
         System.out.println(piggyBank.getBalance());
         piggyBank.addPenny();
         piggyBank.addQuarter();
         System.out.println(piggyBank.getBalance());
      }
      catch(Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
