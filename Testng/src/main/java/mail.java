import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mail {

	WebDriver driver;
	
@BeforeMethod
public void test() {
	System.setProperty("webdriver.chrome.driver","/home/dhanvika/Downloads/chromedriver_linux64/89/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}	
@AfterMethod
public void teardown() {
	driver.quit();
}

@Test
public void login() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/ul[1]/li[7]/a")).click();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("vivek.sakhamuri@gmail.com");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("9492716980");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(40);
}
	
	
	
	
	
	
	
	
}
