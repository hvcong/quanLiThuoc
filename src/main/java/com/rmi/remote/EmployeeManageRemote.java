package com.rmi.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.List;
 

import com.rmi.interfaces.IEmployeeManage;
 

 
public class EmployeeManageRemote  extends UnicastRemoteObject implements IEmployeeManage {
    public EmployeeManageRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
 
    // Method to CREATE an employee in the database
    public Integer addEmployee(String fname, String lname, int salary) {
      return 1;
    }
 
    // Method to READ all the employees
    public void listEmployees() {
    	
    }
 
    // Method to UPDATE salary for an employee
    public void updateEmployee(Integer EmployeeID, int salary) {
        
    }
 
    // Method to DELETE an employee from the records
    public void deleteEmployee(Integer EmployeeID) {
       
    }

	
}