package me.wonsey.ood.television;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImplementation extends UnicastRemoteObject implements MyRemote
{

   //private static final long serialVersionUID = -2688310496174735782L;

   public MyRemoteImplementation() throws RemoteException
   {
      super();
   }

   @Override
   public String saySomething()// throws RemoteException
   {
      return "I'm giving up on you...";
   }

}
