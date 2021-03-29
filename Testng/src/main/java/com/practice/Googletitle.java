package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletitle {
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
  @Test(priority = 1,groups = "Login")
  public void GoogleTitleTest() {
	  String title = driver.getTitle();
	  System.out.println("title");
  }
  @Test(priority = 3,groups = "Logo")
  public void Googlelogo() {
	 boolean b =driver.findElement(By.xpath("/html/body/div[2]/div[4]/span[1]/center/div[1]/img")).isDisplayed();
  }
  @Test(priority = 2,groups="Login")
  public void loginlink() {
	  driver.findElement(By.linkText("Gmail")).isDisplayed();
  }
  @Test(priority = 4,groups = "Test")
  public void Test1() {
	  System.out.println("test1");
  }
  @Test(priority = 5,groups = "Test")
  public void test2() {
	  System.out.println("test2");
  }
  @Test(priority = 6,groups = "Test")
  public void test3() {
	  System.out.println("test3");
  }
  
  
  
  
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
