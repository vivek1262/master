package com.invocationcount;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(invocationCount = 10)
	public void Invocationcount() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println("sum is"+c);
	}
	
	
	
	
	
}
