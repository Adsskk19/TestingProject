package com.kiran;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	public int add(int a,int b) {
		int res = a+b;
		return res;
	}
	public int sub(int a,int b) {
		int res = a-b;
		return res;
	}
	public double divide(int a,int b) {
		double res = a/b;
		return res;
	}

}
