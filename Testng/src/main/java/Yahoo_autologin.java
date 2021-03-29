import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "yahoo_login")
public class Yahoo_autologin {

	WebDriver driver;
	
public void logintoyahoo() throws InterruptedException {
//	System.setProperty("webdriver.firefox.driver", "/home/dhanvika/Downloads/geckodriver-v0.29.0-linux64/geckodriver");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://login.yahoo.com/?YY=28789&order=down&sort=date&pos=0&.src=ym");
	driver.findElement(By.id("login-username")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	driver.findElement(By.id("login-passwd")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	Thread.sleep(3000);
	Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	driver.quit();
}

@DataProvider(name = "yahoo_login")
public Object[][] passData(){
	Object[][] data = new Object[3][2];
	data[0][0] = "vivek";
	data[0][1] = "vivek1234";
	data[1][0] = "vivek12";
	data[1][1] = "vivek1234";
	data[2][0] = "vivek1262@yahoo.com";
	data[2][1] = "9492716980";
	
return data;


}

@AfterMethod
public void teardown() {
	driver.quit();
}
	
	
	
}
