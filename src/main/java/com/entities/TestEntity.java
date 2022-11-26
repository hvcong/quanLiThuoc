package com.entities;

import java.io.Serializable;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("testentities")
public class TestEntity implements Serializable {
	@Id
	private ObjectId id;
	private String name;
	
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TestEntity() {
		super();
	}
	public TestEntity( String name) {
		super();
		this.name = name;
	}
	
	
}
