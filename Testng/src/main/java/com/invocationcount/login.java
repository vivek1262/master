package com.invocationcount;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class login {
		
		WebDriver driver;
		
		@BeforeMethod
			public void Setup() throws InterruptedException
			  {
				  System.setProperty("webdriver.chrome.driver", "/home/dhanvika/Downloads/chromedriver_linux64/chromedriver");
				  driver = new ChromeDriver();
				  driver.get("http://www.gmail.com");
//				  driver.manage().deleteAllCookies();
				  driver.manage().window().maximize();
				  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				  Thread.sleep(2000);
			  }
		@Test
		public void LoginTest() throws InterruptedException{
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vivek254258");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Svivek123#");
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
			Thread.sleep(3000);
		}
		
		
		@AfterMethod
		public void Teardown() {
			driver.quit();
		}
		
		
}
