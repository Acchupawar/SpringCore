package com.spring.core.annatation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	private String  name;
	
	@Autowired
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}

//	@Autowired
	public Emp(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
