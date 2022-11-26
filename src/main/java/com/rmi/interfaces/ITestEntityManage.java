package com.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.entities.TestEntity;

public interface ITestEntityManage extends Remote {
	public Integer addTestEntity(TestEntity obj)throws RemoteException;
	
}
