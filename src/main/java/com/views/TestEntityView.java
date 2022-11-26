package com.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.entities.TestEntity;
import com.rmi.interfaces.ITestEntityManage;
import com.rmi.remote.TestEntityManageRemote;
import com.utils.Constants;

public class TestEntityView extends JFrame {

	ITestEntityManage testEntityManage;

	private void init() {

		
				try {
					testEntityManage = (ITestEntityManage) Naming.lookup(Constants.BASE_PATH_RMI + Constants.STUB_TEST_ENTITY);
					System.out.println("remote ok");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		

	}

	public TestEntityView() {
		setTitle("My Gui");
        setSize(400, 400);
        init();

        // Create JButton and JPanel
        JButton button = new JButton("Click here!");
        JPanel panel = new JPanel();

        // Add button to JPanel
        panel.add(button);
        // And JPanel needs to be added to the JFrame itself!
        this.getContentPane().add(panel);
		this.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("click");
				TestEntity obj = new TestEntity("test name");
				System.out.println(obj.getName());
				try {
					int i = testEntityManage.addTestEntity(obj);
					System.out.println("i = " + i);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					System.out.println("errror here");
					e1.printStackTrace();
				}
				
			}
		});
	}
}
