import java.io.FileInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import jxl.Sheet;
import jxl.Workbook;

public class Excelsheet {
public static  WebDriver driver;
@BeforeClass
public static void Startup()
{
	driver = new FirefoxDriver();
	
}
@AfterClass
public static void teardown() {
	driver.quit();
	}
@Test
public void login()throws Exception{
	//Reading username and password from excel file and assign to variables
	FileInputStream f1 = new FileInputStream("//home//dhanvika//Downloads//LoginExcel.xslx");
	Workbook w = Workbook.getWorkbook(f1);
	Sheet s = w.getSheet(0);
	String un = s.getCell(0,1).getContents();
	String pw = s.getCell(1,1).getContents();
	//typing username and password from excel file
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.name("txtUsername")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("login completed");
	Reporter.log("Login success");
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("logout success");
		 
}

}
