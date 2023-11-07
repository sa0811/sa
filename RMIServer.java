package com.RMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer extends UnicastRemoteObject implements RMIInterface {

	public RMIServer() throws RemoteException {
		super();
	}
	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		try {
			Registry registry = LocateRegistry.createRegistry(1878);
			registry.bind("hello", new RMIServer());
			System.out.println("The RMI Server is running and ready...");
		} catch(Exception e) {
			System.out.println("The RMI Server is not running...");
		}
	}
	
	@Override
	public void displayMessage() throws RemoteException {
		System.out.println("-----------------------------------");
		System.out.println("Hello Eclipse!");
		System.out.println("-----------------------------------");
	}
}


