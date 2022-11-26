package com.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmployeeManage extends Remote {

	public Integer addEmployee(String fname, String lname, int salary)throws RemoteException;
	public void updateEmployee(Integer EmployeeID, int salary)throws RemoteException;
	public void deleteEmployee(Integer EmployeeID)throws RemoteException;
	public void listEmployees() throws RemoteException;
}
