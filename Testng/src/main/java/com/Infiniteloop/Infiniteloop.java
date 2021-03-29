package com.Infiniteloop;

import org.testng.annotations.Test;

public class Infiniteloop {
//@Test(invocationCount = 2,expectedExceptions = NumberFormatException.class)
//public void Infiniteloop() {
//int	i=1;
//	while(i==1) {
//		System.out.println(i);
//	}
//	
//}
@Test(expectedExceptions = NumberFormatException.class)
public void Infinite() {
	String x = "110A";
	Integer.parseInt(x);
	
}


}
