import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ResizeBrowser {
	
    private static final org.openqa.selenium.Dimension Dimension = null;

	@Test	
    public void launchBrowser() {
    	System.setProperty("webdriver.gecko.driver","/home/dhanvika/Downloads/geckodriver-v0.29.0-linux64");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.softwaretestingmaterial.com");
        System.out.println(driver.manage().window().getSize());
        //Create object of Dimensions class
        Dimension d = new Dimension(480,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(Dimension);
        System.out.println(driver.manage().window().getSize());
     }	
}