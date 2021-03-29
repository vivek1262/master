package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingBasics {

	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("launch browser");
	}
@BeforeClass
public void login() {
	System.out.println("login into app");
}

@BeforeMethod
public void enterURL() {
	System.out.println("enter URL");
}

@Test
public void googleTest() {
	System.out.println("google test");
}
@Test
public void searchTest() {
	System.out.println("search test");
}
@Test
public void googleLogoTest() {
	System.out.println("google logo testing");
}
@AfterMethod
public void logout() {
	System.out.println("logout the app");
	
}
@AfterTest
public void deleteAllCookies() {
	System.out.println("delete all cookies");
}
@AfterClass
public void closebrowser() {
	System.out.println("close the browser");
}
@AfterSuite
public void generateTestReport() {
	System.out.println("generate test report");
}


}
