import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class screenshot {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.driver", "/home/dhanvika/Downloads/geckodriver-v0.29.0-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		takeScreenshot("google_homepage");
	}
		
public static void takeScreenshot(String fileName) throws IOException {
		 File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(file, new File("/home/dhanvika/eclipse-workspace/Testng/src/main/java" + fileName +".jpg"));
	     
	        
	        driver.close();
	    }
	}
