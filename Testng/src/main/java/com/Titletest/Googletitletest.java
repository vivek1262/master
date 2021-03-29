package com.Titletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletitletest {

	WebDriver driver;
	
	@BeforeMethod
	  public void Setup() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "/home/dhanvika/Downloads/chromedriver_linux64/chromedriver");
		  driver = new ChromeDriver();
		  driver.get("http://www.google.com");
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Thread.sleep(2000);
	  }
	
	@Test
	public void GoogleTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google","title not matched");
		
	}
	@Test
	  public void Googlelogo() {
		 boolean b =driver.findElement(By.xpath("/html/body/div[2]/div[4]/span[1]/center/div[1]/img")).isDisplayed();
	  }
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
