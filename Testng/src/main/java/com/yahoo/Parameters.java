package com.yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Parameters {

	WebDriver driver;
	@Test
	@org.testng.annotations.Parameters({"url","emailId"})
	
	public void LoginForm(String url,String emailId) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/dhanvika/Downloads/chromedriver_linux64/chromedriver");
		driver =new ChromeDriver();
		driver.get("url");
		Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("emailId");
	driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();

	
	
	}
	
	
	
	
	
	
}
