package com.demo;

public class ImmutableClass {
	private final int id;
	private final String name;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public ImmutableClass(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
public static void main (String [] args) {
		ImmutableClass ic=new ImmutableClass(1,"java");
		System.out.println(ic.getId()+ic.getName());
	}

	
}
