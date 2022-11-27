package com.views;

import java.sql.SQLException;

import javax.swing.JFrame;

import com.utils.ConnectDB;

import dev.morphia.Datastore;


public class App {
	public static void main(String[] args) throws SQLException {
		System.out.println("test");
		StartedUI app = new StartedUI();
		app.setVisible(true);
		
	}

}
