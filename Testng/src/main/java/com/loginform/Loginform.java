package com.loginform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class Loginform {
WebDriver driver;
@BeforeMethod
public void Setup() throws InterruptedException
{
	  System.setProperty("webdriver.chrome.driver", "/home/dhanvika/Downloads/chromedriver_linux64/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S117578764%3A1611582790482062&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
}

@DataProvider
public Iterator<Object[]> getTestData() {
	ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
	return testData.iterator();
	
	
}





@Test(dataProvider="getTestData")
public void Regloginform(String firstName,String lastName,String username,String passwd,String confirmpasswd){
	
	//enter data
	
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("firstName");
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("lastName");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("username");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("passwd");
	driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("confirm-passwd");
	
	
}






















@AfterMethod
public void teardown() {
	driver.quit();
}











}
