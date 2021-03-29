import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {
	public static void main(String args[]) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "/home/dhanvika/Downloads/chromedriver_linux64/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.redbus.com");
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Manage Booking"))).build().perform();
		driver.findElement(By.linkText("Email")).click();
		Thread.sleep(10);
		
	}
}
