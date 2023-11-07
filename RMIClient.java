package com.RMI;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.Naming;

public class RMIClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		try {
			RMIInterface helloAPI = (RMIInterface) Naming.lookup("rmi://localhost:1878/hello");
			helloAPI.displayMessage();
		} catch(Exception e) {
			System.out.println("The RMI App is not running...");
			e.printStackTrace();
		}
	}
}
