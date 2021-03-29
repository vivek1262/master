import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Draganddrop {
WebDriver driver ;
@BeforeMethod
public void startUp() {
	driver = new FirefoxDriver();
}
@Test
public void testDragnDrop()throws Exception{
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	assertEquals("Droppable |jQuery UI",driver.getTitle());
	driver.switchTo().frame(0);
	WebDriver d = null;
	Actions a = new Actions(d);
	a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	Thread.sleep(3000L);
}


@AfterMethod
public void Teardown() {
	driver.quit();
}
}
