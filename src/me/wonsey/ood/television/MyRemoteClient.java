package me.wonsey.ood.television;

import java.rmi.*;

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
      }
      catch(Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
