package com.rmi.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.entities.TestEntity;
import com.rmi.interfaces.ITestEntityManage;
import com.utils.ConnectDB;

import dev.morphia.Datastore;

public class TestEntityManageRemote extends UnicastRemoteObject implements ITestEntityManage {
	Datastore datastore = ConnectDB.getDatastore();

	public TestEntityManageRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer addTestEntity(TestEntity obj) throws RemoteException {
		// TODO Auto-generated method stub
		
		try {
//			datastore.save(obj);
			System.out.println("insert ok");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("insert error");
			return 0;
		}
		return 1;
	}

	@Override
	public int test() throws RemoteException {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
