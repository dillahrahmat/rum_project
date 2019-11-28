package com.echo.clientserver.sayhello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SayHello extends Remote{
    
    public String sayHello(String nama) throws RemoteException;
}
