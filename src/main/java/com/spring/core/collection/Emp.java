package com.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String name;
	
	private List<String> phone;
	
	private Set<String> address;
	
	private Map<String, String> cours;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCours() {
		return cours;
	}

	public void setCours(Map<String, String> cours) {
		this.cours = cours;
	}
	
	

	public Emp(String name, List<String> phone, Set<String> address, Map<String, String> cours) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.cours = cours;
	}

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", address=" + address + ", cours=" + cours + "]";
	}
	
	
}
