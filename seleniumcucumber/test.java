import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test {
		public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.selenium","/home/dhanvika/Downloads/chromedriver_linux64/chromedriver.exe");
		Webdriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		}

}
