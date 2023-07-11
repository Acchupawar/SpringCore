package com.spring.core.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Vihan Pawar")
	private String name;

	@Value("Mahadevaura")
	private String city;

//	@Value("#{state}")
	private List<String> list;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}
