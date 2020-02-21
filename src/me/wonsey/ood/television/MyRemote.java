package me.wonsey.ood.television;

import java.rmi.*;

public interface MyRemote extends Remote
{
   public String saySomething() throws RemoteException;
}
