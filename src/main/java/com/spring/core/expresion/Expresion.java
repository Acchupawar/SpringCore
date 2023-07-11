package com.spring.core.expresion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Expresion {

	/*
	 * How to invoke variable value setMethod #{ expresion }
	 */
	@Value("#{22+33}") // expresion languge assin a value
	private int x;

	@Value("#{2+3+5-46+77+99}")
	private int y;

	/*
	 * How to invoke Static Method calling method  #{ T(classPath).method(param) }
	 */
	@Value("#{ T(java.lang.Math).sqrt(555) }") // calling a Static method with parameterize
	private double z;

	/*
	 * How to invoke Static Variable value getMethod  #{ T(classPath).variableName }
	 */
	@Value("#{ T(java.lang.Math).PI }") // calling a Static variable value from other class
	private double e;

	
	/*
	 * How to create object ? 
	 * cunstractor param creating a object and inisalizing a value
	 */
	
	@Value("#{ new java.lang.String('Anand Pawar') }") 
	private String name;
	
	
	@Value("#{ 8>5 }")
	private boolean isActive;
	
	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Expresion [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	

	
	
	

}
