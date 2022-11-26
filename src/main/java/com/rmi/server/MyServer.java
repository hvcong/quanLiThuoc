package com.rmi.server;

import java.rmi.*;
import java.rmi.registry.*;

import com.rmi.interfaces.IEmployeeManage;
import com.rmi.interfaces.ITestEntityManage;
import com.rmi.remote.EmployeeManageRemote;
import com.rmi.remote.TestEntityManageRemote;
import com.utils.Constants;

public class MyServer {
	public static void main(String args[]) {
		try {
			// port
			Registry rgsty = LocateRegistry.createRegistry(Constants.PORT_RMI);
			
			// rebind stub
			IEmployeeManage employeeStub = new EmployeeManageRemote();
			ITestEntityManage testEntityStub = new TestEntityManageRemote();
			
	
			rgsty.rebind("employee", employeeStub);
			rgsty.rebind("testentity", testEntityStub);
			System.out.println("Rebind stub ok!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
