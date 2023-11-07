package com.RMI;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface RMIInterface extends Remote {

	void displayMessage() throws RemoteException;

}
